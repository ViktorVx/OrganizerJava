package organizer.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import organizer.OrganizerApp;

@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(OrganizerApp.class);

    @RequestMapping("/")
    String home() {
        logger.warn("Обновлена главная страница");
        return "Hello world!!!";
    }
}
