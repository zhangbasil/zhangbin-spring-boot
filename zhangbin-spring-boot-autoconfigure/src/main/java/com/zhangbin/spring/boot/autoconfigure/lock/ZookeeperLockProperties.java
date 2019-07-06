package com.zhangbin.spring.boot.autoconfigure.lock;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangbin
 * @Type ZookeeperLockProperties
 * @Desc
 * @date 2018-12-21
 * @Version V1.0
 */
@ConfigurationProperties(prefix = "lock.zookeeper")
public class ZookeeperLockProperties {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
