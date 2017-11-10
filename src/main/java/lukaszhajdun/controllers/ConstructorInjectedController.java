package lukaszhajdun.controllers;

import lukaszhajdun.Services.GreetingService;


/**
 * Created by Kroolik on 2017-11-03.
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
