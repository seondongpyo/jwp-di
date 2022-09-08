package next.config.example;

import core.annotation.Component;
import core.annotation.Inject;

import javax.sql.DataSource;

@Component
public class TestJdbcTemplate {

    private final DataSource dataSource;

    @Inject
    public TestJdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
