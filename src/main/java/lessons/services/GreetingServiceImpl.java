package lessons.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("main")
public class GreetingServiceImpl implements GreetingService {
    private ApplicationContext context;

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }

}