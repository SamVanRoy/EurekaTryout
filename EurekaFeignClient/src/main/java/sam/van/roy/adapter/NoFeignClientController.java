package sam.van.roy.adapter;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/no-feign")
public class NoFeignClientController {

    private final EurekaClient eurekaClient;

    @GetMapping("/get-hello-world")
    public String getHelloWorld() {
        InstanceInfo service = eurekaClient
                .getApplication("spring-cloud-eureka-client")
                .getInstances()
                .get(0);

        String hostName = service.getHostName();
        int port = service.getPort();

        URI url = URI.create("http://" + hostName + ":" + port + "/eureka-client/hello");

        ResponseEntity<String> response = new RestTemplate().getForEntity(url, String.class);

        return response.getBody();
    }
}
