package lessons;

import lessons.services.CommandManager;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan
@Import(AnotherConfiguration.class)
public class LessonsConfiguration {

    @Bean
    MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
    


    @Bean
    @Scope("prototype")
    public Object asyncCommand() {
        return new Object();
    }

    @Bean
    public CommandManager commandManager() {
        // возвращаем новую анонимную реализацию CommandManager
        // с новым объектом
        return new CommandManager() {
            protected Object createCommand() {
                return asyncCommand();
            }
        };
    }
}