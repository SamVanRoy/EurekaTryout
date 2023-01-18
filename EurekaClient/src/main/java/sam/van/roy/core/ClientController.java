package sam.van.roy.core;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/eureka-client")
public interface ClientController {
    void helloWorld();
}
