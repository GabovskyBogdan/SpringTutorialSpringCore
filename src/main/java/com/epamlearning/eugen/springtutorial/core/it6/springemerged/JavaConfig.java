package com.epamlearning.eugen.springtutorial.core.it6.springemerged;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

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
    public MessageSender sender() {
        return new SystemOutMessageSender();
    }

    @Bean(name = "function3")
    public BusinessFunction function(final MessageProvider customStringMessageProvider,
                                     final MessageSender sender) {
        return new SimplePairExec(customStringMessageProvider, sender);
    }

    @Bean(name = "function2")
    BusinessFunction function2(final MessageProvider customStringMessageProvider,
                               final MessageSender sender) {
        return new SimplePairExec(customStringMessageProvider, sender);
    }


//    Менее явный вариант того, что написано выше. Выдает ошибку, т.к. спринг сам ищет,
//    где использовать customStringMessageProvider()
//
//    @Bean(name = "function")
//    public BusinessFunction function() {
//        return new SimplePairExec(customStringMessageProvider(), sender());
//    }
//
//    @Bean(name = "function2")
//    BusinessFunction function2() {
//        return new SimplePairExec(customStringMessageProvider(), sender());
//    }
}
