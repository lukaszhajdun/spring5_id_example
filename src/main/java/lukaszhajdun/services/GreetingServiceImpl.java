package lukaszhajdun.services;

import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GUYS = "Hello Guys!!!! - Original Greeting";

    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}

