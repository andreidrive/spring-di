package andrei.dev.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterConstructor {
    private final GreetingService greetingService;

    public GreetingPrinterConstructor(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void print(String name) {
        greetingService.greet(name);
    }
}
