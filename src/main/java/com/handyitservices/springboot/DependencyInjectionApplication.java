package com.handyitservices.springboot;

import com.handyitservices.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
//@ComponentScan("com.handyitservices") we commented this because we will start using xml configuration instead of java configuration
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class,args);
        GreetingController controller = (GreetingController)ctx.getBean("greetingController");
        controller.sayHello();
    }

}
