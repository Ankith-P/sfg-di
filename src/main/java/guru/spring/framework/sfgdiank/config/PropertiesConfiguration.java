package guru.spring.framework.sfgdiank.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ank.jdbc1")
public class PropertiesConfiguration {
    String username;
    String password;
    String Url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return Url;
    }

    public void setUrl(String dbUrl) {
        this.Url = dbUrl;
    }
}
