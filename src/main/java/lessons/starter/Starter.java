package lessons.starter;

import lessons.BeanWithDependency;
import lessons.LessonsConfiguration;
import lessons.services.GreetingService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Starter {
    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        BeanWithDependency withDependency = context.getBean(BeanWithDependency.class);
        logger.info(greetingService.sayGreeting()); // "Greeting, user!"
        logger.info(withDependency.printText()); // "Some text!"

        logger.info("Message: " + context.getMessage("message", null, Locale.getDefault()));
        logger.info("Argument.required: " + context.getMessage("argument.required", new Object[]{"Test_UK_Argument"}, Locale.UK));
        //...

    }
}