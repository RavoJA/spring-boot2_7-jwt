package jean.aime.springboot2_7jwt;

import jean.aime.springboot2_7jwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SpringBoot27JwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot27JwtApplication.class, args);
    }

}
