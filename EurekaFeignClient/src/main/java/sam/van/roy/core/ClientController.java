package sam.van.roy.core;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-eureka-client", path = "/eureka-client")
public interface ClientController {
    @GetMapping("/hello")
    String helloWorld();
}
