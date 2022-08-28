package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;


/**
 * 日志配置
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level loggerLever(){
        return Logger.Level.BASIC;
    }
}
