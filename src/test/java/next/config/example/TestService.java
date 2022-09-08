package next.config.example;

import core.annotation.Inject;
import core.annotation.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    @Inject
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
}
