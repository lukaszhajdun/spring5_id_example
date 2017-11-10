package lukaszhajdun.controllers;

import lukaszhajdun.Services.GreetingService;
import lukaszhajdun.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Kroolik on 2017-11-03.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
