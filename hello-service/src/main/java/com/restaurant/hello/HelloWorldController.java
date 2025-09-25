package com.restaurant.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a Spring MVC controller that handles REST requests.
public class HelloWorldController {

    // Existing endpoint from Day 2
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! This is your first Spring Boot API.";
    }

    /**
     * New Dynamic Endpoint: Handles GET requests to /greet.
     * It expects a URL parameter named 'name'.
     * Example URL: http://localhost:8080/greet?name=Mentor
     * * @param userName The value of the 'name' query parameter. 
     * The 'defaultValue' ensures it works even if 'name' is omitted.
     * @return A personalized greeting message.
     */
    @GetMapping("/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "User") String userName) {
        // String.format() is a best practice for clean string concatenation.
        // We use a simple message, but in a real app, this would involve business logic.
        return String.format("Hello, %s! Welcome to the Multilingual Restaurant System.", userName);
    }
}