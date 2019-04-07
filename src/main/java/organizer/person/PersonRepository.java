package organizer.person;


import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface PersonRepository extends Repository<Person, UUID> {

    void save(Person person);
}
