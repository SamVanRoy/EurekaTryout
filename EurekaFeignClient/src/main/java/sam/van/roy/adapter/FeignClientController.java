package sam.van.roy.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sam.van.roy.core.ClientController;

@RequiredArgsConstructor
@RestController
public class FeignClientController {

    private final ClientController clientController;

    @RequestMapping("/get-hello-world")
    public String getHelloWorld() {
        return clientController.helloWorld();
    }
}
