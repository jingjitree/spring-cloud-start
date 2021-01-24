package top.inson.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface IHelloService {

    @GetMapping("/hello/sayHello")
    String sayHello(@RequestParam String username);


}
