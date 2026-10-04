package jsp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Car {

    //@Autowired
    Engine engine;

    public Car() {
        System.out.println("Car object created");
    }

    @PreDestroy
    public void init() {
        System.out.println("Car is ready to use");
    }

    public void drive() {
        System.out.println("Car is driving...");
    }

    @PostConstruct
    public void destroy() {
        System.out.println("Car bean is destroyed");
    }
}