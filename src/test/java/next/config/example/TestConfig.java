package next.config.example;

import core.annotation.Bean;
import core.annotation.ComponentScan;
import core.annotation.Configuration;
import core.di.factory.example.MyJdbcTemplate;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("next.config.example")
public class TestConfig {

    @Bean
    public MyJdbcTemplate jdbcTemplate() {
        return new MyJdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        return new BasicDataSource();
    }
}
