package com.example.demo.controllers;

import models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {
    // GET
//    @GetMapping("/say-hello")
//    public ResponseEntity<String> sayHello() {
//        // ResponseEntity is a generic class that takes two parameters:
//        // 1. The body of the response
//        // 2. The HTTP status code
//            // ok() is a static method that returns a 200 OK status code
//        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
//    }
    // Return a JSON object

    @GetMapping("/say-hello")
    public ResponseEntity<Map<String, String>> sayHello() {
        // Map<String, String> is a generic class that takes two parameters:
        // 1. The key type
        // 2. The value type

        // Map.of() is a static method that returns a Map object (will work as a JSON object)
        // Map.of() takes two parameters:
        // 1. The key
        // 2. The value
        Map<String, String> response = Map.of("message", "Hello World!");

        // ResponseEntity is a generic class that takes two parameters:
        // 1. The body of the response
        // 2. The HTTP status code
            // ok() is a static method that returns a 200 OK status code
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Return a JSON object with a person object info
    @GetMapping("/say-hello-with-person")
    public ResponseEntity<Map<String, Object>> sayHelloWithPerson() {
        // Map<String, Object> is a generic class that takes two parameters:
        // 1. The key type
        // 2. The value type

        // Map.of() is a static method that returns a Map object (will work as a JSON object)
        // Map.of() takes two parameters:
        // 1. The key
        // 2. The value

        // Create a new Person object
        Person person = new Person();
        person.setFirstName("Sofia");
        person.setLastName("Hernandez");
        person.setAge(30);

        Map<String, Object> response = Map.of(
                // The person object will be converted to a JSON object automatically by Spring
                "person", person
        );

        // ResponseEntity is a generic class that takes two parameters:
        // 1. The body of the response
        // 2. The HTTP status code
            // ok() is a static method that returns a 200 OK status code
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/persona")
    public ResponseEntity<Person> person() {
        // It will return a JSON object with the person object info

        // Create a new Person object
        Person person = new Person();
        person.setFirstName("Sofia");
        person.setLastName("Hernandez");
        person.setAge(30);

        // ResponseEntity<Person> is a generic class that takes two parameters:
        // 1. The body of the response
        // 2. The HTTP status code
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping("/person-list")
    public ResponseEntity<List<Person>> listPerson() {
        // It will return a JSON object with all the person objects info in a list

        // Create a new Person object
        Person person1 = new Person();
        person1.setFirstName("Sofia");
        person1.setLastName("Hernandez");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setFirstName("Juan");
        person2.setLastName("Perez");
        person2.setAge(40);

        Person person3 = new Person();
        person3.setFirstName("Maria");
        person3.setLastName("Garcia");
        person3.setAge(50);

        // Create a list of Person objects
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);

        // ResponseEntity<> is a generic class that takes two parameters:
        // 1. The body of the response
        // 2. The HTTP status code
        return new ResponseEntity<>(listPerson, HttpStatus.OK);
    }

    @PostMapping("/save-person")
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        // Receive a JSON object with the person object info
        // All the attributes of the person object will be mapped to the JSON object
        person.getFirstName();
        person.getLastName();
        person.getAge();

        // Call a service to save the person object

        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
