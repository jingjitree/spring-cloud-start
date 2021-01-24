package top.inson.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystrix implements IHelloService{


    @Override
    public String sayHello(String username) {
        return "请求失败" + username;
    }
}
