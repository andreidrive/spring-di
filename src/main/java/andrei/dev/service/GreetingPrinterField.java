package andrei.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterField {
    @Autowired
    @Qualifier("friend")
    private GreetingService greetingService;

    public void print(String name) {
        greetingService.greet(name);
    }
}
