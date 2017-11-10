package lukaszhajdun.Services;

import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GUYS = "Hello Guys!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}

