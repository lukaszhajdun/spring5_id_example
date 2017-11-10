package lukaszhajdun.controllers;

import lukaszhajdun.Services.GreetingService;


/**
 * Created by Kroolik on 2017-11-03.
 */
public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
