package lukaszhajdun.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getPolishGreeting() {
        return "Witam was!!!";
    }

    @Override
    public String getGermanGreetings() {
        return "Hallo Leute!! - Dies ist die Standardbegrüßung";
    }
}
