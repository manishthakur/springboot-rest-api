package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.modelmapper.ModelMapper;

@SpringBootApplication
public class SpringbootRestApiApplication {

//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiApplication.class, args);
    }

}
