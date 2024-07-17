package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }


    @GetMapping("/main")
    public String main() {
        return "<h1>MAIN PAGE</h1>  <h2>woooww</h2>";
    }


    @GetMapping("/addController")
    public String main() {
        return "<h1>MAIN PAGE</h1>  <h2>woooww</h2> <h1>New Controller has Been Added</h1>";
    }
}