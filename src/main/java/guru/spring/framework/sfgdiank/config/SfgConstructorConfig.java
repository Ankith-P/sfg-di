package guru.spring.framework.sfgdiank.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
@ConstructorBinding
@ConfigurationProperties("ank.jdbc")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String Url;

    public SfgConstructorConfig(String username, String password, String url) {
        this.username = username;
        this.password = password;
        Url = url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return Url;
    }
}
