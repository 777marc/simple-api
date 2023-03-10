package dev.mendozacode.simple.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "Heyo Marc!";
    }

    @RequestMapping("/heyo")
    public String heyo() {
        return "You're the best!";
    }
}
