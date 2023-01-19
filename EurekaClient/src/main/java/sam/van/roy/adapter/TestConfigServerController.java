package sam.van.roy.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sam.van.roy.TestConfig;

@RequiredArgsConstructor
@RestController
public class TestConfigServerController {

    private final TestConfig testConfig;

    @GetMapping(value = "/test-config-server")
    public String getConfigData() {
        return "Name: " + this.testConfig.getName() + " Phone: " + this.testConfig.getPhone();
    }
}
