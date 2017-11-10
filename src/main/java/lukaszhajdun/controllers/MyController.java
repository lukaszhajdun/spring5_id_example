package lukaszhajdun.controllers;

import lukaszhajdun.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Kroolik on 2017-11-03.
 */

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!");

        return greetingService.sayGreeting();
    }
}
