package com.zhangbin.spring.boot.autoconfigure.convention;

import com.zhangbin.convention.aop.exception.ResultExceptionAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbin
 * @Type ServiceAutoConfiguration
 * @Desc Service层自动配置
 * @date 2018-11-09
 * @Version V1.0
 */
@Configuration
@ConditionalOnClass(ResultExceptionAspect.class)
public class ServiceAutoConfiguration {

    /**
     * 统一Result异常处理
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(ResultExceptionAspect.class)
    public ResultExceptionAspect resultExceptionAspect() {
        return new ResultExceptionAspect();
    }



}
