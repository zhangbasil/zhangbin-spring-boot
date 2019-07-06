package com.zhangbin.spring.boot.autoconfigure.convention;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.zhangbin.convention.fastjson.ExtendFastJsonConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author zhangbin
 * @Type WebAutoConfiguration
 * @Desc
 * @date 2019-04-10
 * @Version V1.0
 */
@Configuration
@ConditionalOnWebApplication
public class WebAutoConfiguration implements WebMvcConfigurer {

    /**
     *
     * 使用FastJson
     *
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter httpMessageConverter = new FastJsonHttpMessageConverter();
        httpMessageConverter.setFastJsonConfig(new ExtendFastJsonConfig());
        converters.add(httpMessageConverter);
    }
}
