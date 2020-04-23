package com.zhangbin.spring.boot.autoconfigure.specification;

import com.zhangbin.specification.handler.ResultExceptionAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


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
