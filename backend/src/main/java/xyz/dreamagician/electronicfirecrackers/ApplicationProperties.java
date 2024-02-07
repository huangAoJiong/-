package xyz.dreamagician.electronicfirecrackers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("application")
public class ApplicationProperties {
    private boolean loginRequired;
    private String username;
    private String password;
    private List<String> urls;
    private boolean blessingEnabled;
    private List<String> blessings;

    public boolean isLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(boolean loginRequired) {
        this.loginRequired = loginRequired;
    }

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

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public boolean isBlessingEnabled() {
        return blessingEnabled;
    }

    public void setBlessingEnabled(boolean blessingEnabled) {
        this.blessingEnabled = blessingEnabled;
    }

    public List<String> getBlessings() {
        return blessings;
    }

    public void setBlessings(List<String> blessings) {
        this.blessings = blessings;
    }
}
