package com.zhangbin.spring.boot.autoconfigure.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author <a href="mailto:hbsy_zhb@163.com"> zhangbin </a>
 */
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    private boolean enabled = false;

    private String title;

    private String description;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
