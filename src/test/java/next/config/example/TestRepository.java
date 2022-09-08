package next.config.example;

import core.annotation.Inject;
import core.annotation.Repository;
import core.di.factory.example.MyJdbcTemplate;

@Repository
public class TestRepository {

    private final MyJdbcTemplate jdbcTemplate;

    @Inject
    public TestRepository(MyJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
