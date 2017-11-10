package lukaszhajdun.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Kroolik on 2017-11-03.
 */

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!");

        return "foo";
    }
}
