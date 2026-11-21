package andrei.dev.service;

import org.springframework.stereotype.Component;

@Component("friend")
public class FriendlyGreetingService implements  GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Добро пожаловать, " + name);
    }
}
