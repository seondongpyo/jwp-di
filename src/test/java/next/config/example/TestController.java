package next.config.example;

import core.annotation.Inject;
import core.annotation.web.Controller;

@Controller
public class TestController {

    private final TestService testService;

    @Inject
    public TestController(TestService testService) {
        this.testService = testService;
    }
}
