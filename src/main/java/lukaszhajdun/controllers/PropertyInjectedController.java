package lukaszhajdun.controllers;

import lukaszhajdun.Services.GreetingServiceImpl;

/**
 * Created by Kroolik on 2017-11-03.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
