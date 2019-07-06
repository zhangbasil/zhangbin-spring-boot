package com.zhangbin.spring.boot.autoconfigure.lock.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangbin
 * @Type EnableRedisLock
 * @Desc
 * @date 2018-12-05
 * @Version V1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableRedisLock {
}
