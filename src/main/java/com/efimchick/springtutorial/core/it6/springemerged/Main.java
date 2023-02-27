package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Run with Execute Maven goal
 * exec:java -Dexec.mainClass="com.efimchick.springtutorial.core.it4.oop.Main" -Dexec.arguments="it is a message"
 */

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException {

        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfig.class
                );

        final BusinessFunction bf = context.getBean("allInOne", BusinessFunction.class);
        bf.exec();

        final SomeEventPublisher publisher = context.getBean(SomeEventPublisher.class);
        publisher.generateEvent();
        publisher.generateEvent();
        publisher.generateEvent();
        publisher.generateEvent();

        bf.exec();


    }
}
