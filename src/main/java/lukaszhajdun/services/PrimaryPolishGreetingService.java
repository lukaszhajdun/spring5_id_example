package lukaszhajdun.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
@Profile("pl")
@Primary
public class PrimaryPolishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Witam was!!!";
    }
}
