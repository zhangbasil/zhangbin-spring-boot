package com.zhangbin.spring.boot.autoconfigure.specification;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.zhangbin.specification.jackson.DefaultJacksonAnnotationIntrospector;
import com.zhangbin.specification.web.advice.jackson.filter.DefaultPropertyFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Configuration
@ConditionalOnWebApplication
//@ComponentScan({"com.alibaba.fastjson.support.spring", "com.zhangbin.specification.web.fastjson"})
public class WebAutoConfiguration implements WebMvcConfigurer {


    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

//    @Bean
//    @ConditionalOnMissingBean(FastJsonHttpMessageConverter.class)
//    public HttpMessageConverter<Object> httpMessageConverter() {
//        FastJsonHttpMessageConverter httpMessageConverter = new FastJsonHttpMessageConverter();
//        httpMessageConverter.setFastJsonConfig(new ExtendFastJsonConfig());
//        // fastJson 浏览器中文乱码
//        httpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
//        return httpMessageConverter;
//    }


    @Bean
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper objectMapper() {
        return Jackson2ObjectMapperBuilder
                .json()
                .simpleDateFormat(DATE_PATTERN)
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATE_PATTERN)))
                .annotationIntrospector(new DefaultJacksonAnnotationIntrospector())
                .filters(new SimpleFilterProvider().setFailOnUnknownId(false).addFilter(DefaultPropertyFilter.FILTER_ID, new DefaultPropertyFilter()))
                .mixIn(Object.class, DefaultPropertyFilter.class)
                .build();
    }
}
