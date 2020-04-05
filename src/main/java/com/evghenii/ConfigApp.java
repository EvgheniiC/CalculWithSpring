package com.evghenii;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com"})
@ImportResource("classpath:/application-context.xml")
public class ConfigApp {

    @Bean
    Mathematician mathematician() {
        return new Mathematician();
    }

    @Bean
    public Geometry geometry() {
        return new Geometry(mathematician());
    }

    @Bean
    public Operation math(Geometry geometry) {
        return new Operation(geometry);
    }

}

