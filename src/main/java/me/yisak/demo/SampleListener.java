package me.yisak.demo;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;




@Component
public class SampleListener implements ApplicationRunner {

  @Autowired
  private String hello;


    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        System.out.println("=====================");
        System.out.println(hello);
        System.out.println("=====================");

    }
}
