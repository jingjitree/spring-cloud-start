package top.inson.springcloud.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.inson.springcloud.service.IHelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private IHelloService helloService;


    @GetMapping("/hi")
    public String sayHello(@RequestParam(required = false) String username){
        return helloService.sayHello(username);
    }


}
