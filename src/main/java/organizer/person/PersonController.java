package organizer.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import organizer.OrganizerApp;

import java.util.Date;

@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(OrganizerApp.class);
    private final PersonRepository persons;

    public PersonController(PersonRepository personService) {
        this.persons = personService;
    }

    @RequestMapping("/new")
    String home() {
        Person person = new Person();
        person.setFirstName("Петров");
        person.setLastName("Петр");
        person.setMiddleName("Петрович");
        person.setBirthDate(new Date());
        person.setEmail("petr@ya.ru");

        persons.save(person);
        //*****************************************
        logger.info("Обновлена главная страница");
        return "Hello world!!!";
    }
}
