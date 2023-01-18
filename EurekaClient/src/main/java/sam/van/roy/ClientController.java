package sam.van.roy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/eureka-client")
public class ClientController {

    @GetMapping
    public void helloWorld() {
        log.info("Hello World!");
    }
}
