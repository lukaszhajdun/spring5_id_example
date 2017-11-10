package lukaszhajdun.controllers;

import lukaszhajdun.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * Created by Kroolik on 2017-11-03.
 */
@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService (@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
