package com.zhangbin.spring.boot.autoconfigure.lock;

import com.zhangbin.convention.lock.RedisDistributedLock;
import com.zhangbin.spring.boot.autoconfigure.lock.annotation.EnableRedisLock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbin
 * @Type RedisLockAutoConfiguration
 * @Desc 分布式redis锁自动装载配置
 * @date 2018-12-05
 * @Version V1.0
 */
@Configuration
@ConditionalOnBean(annotation = EnableRedisLock.class)
public class RedisLockAutoConfiguration {

    @Bean
    @ConditionalOnMissingClass
    public RedisDistributedLock redisDistributedLock() {
        return new RedisDistributedLock();
    }

}
