package sam.van.roy.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import sam.van.roy.core.ClientController;

@Slf4j
@RestController
public class ClientControllerImpl implements ClientController {

    @Override
    public String helloWorld() {
        log.info("Hello World!");
        return "Hello World";
    }
}
