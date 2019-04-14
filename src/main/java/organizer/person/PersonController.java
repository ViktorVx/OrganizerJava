package organizer.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import organizer.OrganizerApp;

import java.util.Date;

@Controller
@RequestMapping("/persons")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(OrganizerApp.class);
    private final PersonRepository persons;

    public PersonController(PersonRepository personService) {
        this.persons = personService;
    }

//    @RequestMapping(value = "/new", method = RequestMethod.GET)
//    String addPerson(Model model) {
//        //*** PERSON SAVING ***********************
//        Person person = new Person();
//        person.setFirstName("Петров");
//        person.setLastName("Петр");
//        person.setMiddleName("Петрович");
//        person.setBirthDate(new Date());
//        person.setEmail("petr@ya.ru");
//
////        persons.save(person);
//        //*****************************************
//        logger.info("Обновлена главная страница");
//        return "persons/new_person";
//        //todo следующим этапом сделать форму для ввода персон в БД
//    }

    @PostMapping("/new_person")
    public String newPersonSubmit(@ModelAttribute Person person) {
        persons.save(person);
        return "persons/additionSuccess";
    }

    @GetMapping("/new_person")
    public String newPersonForm(Model model) {
        model.addAttribute("person", new Person());
//        System.out.println(((Person)model.asMap().get("person")).getLastName());
        return "persons/new_person";
    }
}
