package lukaszhajdun.services;

import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter service";
    }
}
