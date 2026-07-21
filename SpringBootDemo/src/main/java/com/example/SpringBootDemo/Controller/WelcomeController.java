package com.example.SpringBootDemo.Controller;

import com.example.SpringBootDemo.Service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Handler;

@RestController
public class WelcomeController {

    GreetingService greetingService;

    WelcomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public String welcomeMssage() {
        return greetingService.greet("Raj");
    }

    @Value("${server.port}")
    Integer portNumber;

    @GetMapping("/port-number")
    public String getPortNumber() {
        return "The port number is " + portNumber.toString();
    }
}
