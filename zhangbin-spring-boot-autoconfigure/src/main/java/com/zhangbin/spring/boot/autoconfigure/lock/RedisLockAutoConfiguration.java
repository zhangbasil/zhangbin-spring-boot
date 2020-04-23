package com.zhangbin.spring.boot.autoconfigure.lock;

import com.zhangbin.specification.lock.RedisDistributedLock;
import com.zhangbin.spring.boot.autoconfigure.lock.annotation.EnableRedisLock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @author zhangbin
 */
@Configuration
@ConditionalOnBean(annotation = EnableRedisLock.class)
@ConditionalOnClass(RedisTemplate.class)
public class RedisLockAutoConfiguration {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Bean
    @ConditionalOnMissingClass
    public RedisDistributedLock redisDistributedLock() {
        return new RedisDistributedLock(redisTemplate);
    }

}
