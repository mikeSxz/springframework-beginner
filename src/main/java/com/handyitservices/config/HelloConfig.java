package com.handyitservices.config;

import com.handyitservices.services.HelloWorldFactory;
import com.handyitservices.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    //@Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish (HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean(name ="french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory helloWorldFactory){
        return helloWorldFactory.createHelloWorldService("ru");
    }
}
