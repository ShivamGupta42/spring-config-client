package demo.spring.config.client.springconfigclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties
public class MsgConfig {
    private String msg;

}
