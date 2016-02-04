package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by mark on 16-2-4.
 */

@RequestMapping("/person")
@RestController
public class PersonController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Person> index() {
        return genData();
    }

    private ArrayList<Person> genData() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(45, "male", "matt", "1578-04-04"));
        persons.add(new Person(45, "female", "sarah", "1645-04-04"));
        return persons;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/{name}")
    public Person getPerson(@PathVariable long id, @PathVariable String name) {
        Person person = new Person();
        person.setAge(45);
        person.setBirthday("45544545");
        person.setGender("female");
        person.setId(id);
        person.setName(name);
        return person;
    }
}
