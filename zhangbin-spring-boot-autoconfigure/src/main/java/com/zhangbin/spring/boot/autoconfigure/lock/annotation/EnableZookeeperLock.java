package com.zhangbin.spring.boot.autoconfigure.lock.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangbin
 * @Type EnableZookeeperLock
 * @Desc
 * @date 2018-12-21
 * @Version V1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableZookeeperLock {
}
