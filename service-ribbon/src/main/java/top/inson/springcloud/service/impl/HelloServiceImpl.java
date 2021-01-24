package top.inson.springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.inson.springcloud.service.IHelloService;

@Slf4j
@Service
public class HelloServiceImpl implements IHelloService {
    @Autowired
    private RestTemplate restTemplate;

    //熔断器，对应的熔断方法是“error”方法
    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String sayHello(String username) {
        String result = restTemplate.getForObject("http://eureka-client/hello/sayHello?username=" + username, String.class);
        log.info("请求接口响应内容" + result);
        return result;
    }

    public String error(String username){
        return "接口请求失败" + username;
    }

}
