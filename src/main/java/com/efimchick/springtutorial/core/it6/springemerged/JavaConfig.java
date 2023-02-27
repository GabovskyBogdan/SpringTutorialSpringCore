package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
@Import(ProvidersConfig.class)
@ImportResource("classpath:it6.xml")
public class JavaConfig {

    @Bean
    public BusinessFunction function(final MessageProvider customStringMessageProvider,
                                     final MessageSender sender) {
        System.out.println(sender);
        return new SimplePairExec(customStringMessageProvider, sender);
    }

    @Bean(name = "function2")
    BusinessFunction function2(final MessageProvider customStringMessageProvider,
                               final MessageSender sender) {
        System.out.println(sender);
        return new SimplePairExec(customStringMessageProvider, sender);
    }

    @Bean
    public BusinessFunction allInOne(final List<MessageProvider> providers,
                                     final MessageSender sender) {
        System.out.println(sender);
        return new AllProvidersToASenderExec(providers, sender);
    }

    @Bean
    public SomeEventPublisher someEventPublisher() {
        return new SomeEventPublisher();
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
