package andrei.dev;

import andrei.dev.config.AppConfig;
import andrei.dev.service.GreetingPrinterConstructor;
import andrei.dev.service.GreetingPrinterField;
import andrei.dev.service.GreetingPrinterSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingPrinterConstructor greetingPrinterConstructor = context.getBean(GreetingPrinterConstructor.class);
        GreetingPrinterField greetingPrinterField = context.getBean(GreetingPrinterField.class);
        GreetingPrinterSetter greetingPrinterSetter = context.getBean(GreetingPrinterSetter.class);

        greetingPrinterConstructor.print("Pasha");
        greetingPrinterField.print("Pasha");
        greetingPrinterSetter.print("Pasha");
    }
}