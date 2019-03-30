package organizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OrganizerApp {

    public static void main(String[] args) {
        SpringApplication.run(OrganizerApp.class, args);
    }

}
