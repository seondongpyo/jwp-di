package next.config;

import core.di.AnnotatedBeanDefinitionReader;
import core.di.factory.DefaultListableBeanFactory;
import next.config.example.*;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class TestConfigTest {

    @Test
    void scan() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AnnotatedBeanDefinitionReader scanner = new AnnotatedBeanDefinitionReader(beanFactory);
        scanner.register(TestConfig.class);
        beanFactory.preInstantiateSingletons();

        Set<Class<?>> beanClasses = beanFactory.getBeanClasses();

        assertThat(beanClasses).contains(
            // @Configuration 으로 등록한 Bean
            TestConfig.class,

            // @ComponentScan 으로 등록한 Bean
            TestController.class,
            TestService.class,
            TestRepository.class,
            TestJdbcTemplate.class,
            TestJdbcTemplate.class
        );
    }
}
