package andrei.dev.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FormalGreetingService implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Здравствуйте, " + name);
    }
}
