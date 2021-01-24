package top.inson.springcloud.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(required = false, defaultValue = "jingjitree") String username){
        log.info("eureka-client进入了欢迎页面" + username);
        return "eureka-client hello world!" + username;
    }


}
