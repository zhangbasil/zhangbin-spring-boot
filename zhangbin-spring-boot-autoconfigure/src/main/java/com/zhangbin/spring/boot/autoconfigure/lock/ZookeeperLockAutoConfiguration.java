package com.zhangbin.spring.boot.autoconfigure.lock;

import com.zhangbin.convention.lock.ZookeeperDistributedLock;
import com.zhangbin.spring.boot.autoconfigure.lock.annotation.EnableZookeeperLock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author zhangbin
 * @Type ZookeeperLockAutoConfiguration
 * @Desc
 * @date 2018-12-21
 * @Version V1.0
 */
@Configuration
@ConditionalOnBean(annotation = EnableZookeeperLock.class)
@EnableConfigurationProperties(ZookeeperLockProperties.class)
public class ZookeeperLockAutoConfiguration {

    @Resource
    private ZookeeperLockProperties zookeeperLockProperties;

    @Bean
    @ConditionalOnMissingClass
    public ZookeeperDistributedLock zookeeperDistributedLock() {
        return new ZookeeperDistributedLock(zookeeperLockProperties.getAddress());
    }
}
