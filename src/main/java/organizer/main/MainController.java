package organizer.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import organizer.OrganizerApp;
import organizer.person.Person;
import organizer.person.PersonRepository;

import java.util.List;

@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(OrganizerApp.class);
    private final PersonRepository persons;

    public MainController(PersonRepository personService) {
        this.persons = personService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Person> personList = (List<Person>) persons.findAll();
        model.addAttribute("persons", personList);
        return "index";
    }

}
