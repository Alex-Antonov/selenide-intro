package my.antonov.selenide.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@EnableConfigurationProperties
@PropertySource("classpath:application.properties")
public class PropertiesConfig {

    @Value("${app.url}")
    private String url;

    @Value("${app.login}")
    private String login;

    @Value("${app.password}")
    private String password;

}
