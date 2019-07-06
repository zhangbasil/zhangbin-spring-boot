package com.zhangbin.spring.boot.autoconfigure.alarm;

import com.zhangbin.convention.aop.exception.ExceptionAlarmHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbin
 * @Type AlarmAutoConfiguration
 * @Desc 告警通知自动装配
 * @date 2019-02-18
 * @Version V1.0
 */
@Configuration
@ConditionalOnClass(ExceptionAlarmHandler.class)
public class AlarmAutoConfiguration {

}
