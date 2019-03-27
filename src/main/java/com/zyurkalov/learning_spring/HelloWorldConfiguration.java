package com.zyurkalov.learning_spring;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer =  new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return  renderer;
    }
}
