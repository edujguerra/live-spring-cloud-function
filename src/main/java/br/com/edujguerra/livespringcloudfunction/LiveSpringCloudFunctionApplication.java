package br.com.edujguerra.livespringcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class LiveSpringCloudFunctionApplication {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(LiveSpringCloudFunctionApplication.class, args);
    }

    @Bean
    public Function<String,String> upperCase(){

       return String::toUpperCase;
    }

}
