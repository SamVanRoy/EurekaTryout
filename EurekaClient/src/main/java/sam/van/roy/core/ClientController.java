package sam.van.roy.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/eureka-client")
public interface ClientController {
    @GetMapping("/hello")
    String helloWorld();
}
