package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProvidersConfig {

    @Bean
    public MessageProvider customStringMessageProvider() {
        final CustomStringMessageProvider provider = new CustomStringMessageProvider();
        provider.setMsg("Hello");
        return provider;
    }

    @Bean
    public MessageProvider hwMessageProvider() {
        return new HelloWorldMessageProvider();
    }


    @Bean
    public MessageProvider awareProvider() {
        return new SpringAwareMessageProvider();
    }

}
