package ilja.spring.runnerz;
import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the Spring Boot Application";
    }
}
