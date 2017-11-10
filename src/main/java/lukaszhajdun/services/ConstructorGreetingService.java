package lukaszhajdun.services;

import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor service";
    }
}
