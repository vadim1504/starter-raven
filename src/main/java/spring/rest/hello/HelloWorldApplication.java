package spring.rest.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(HelloWorldApplication.class);
        builder.headless(false);
        builder.run(args);
    }
}

@RestController()
class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
