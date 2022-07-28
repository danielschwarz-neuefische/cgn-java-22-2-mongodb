package de.neuefische.cgnjava222.mongodb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PetController {

    private final PetRepository repository;

    public PetController(PetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    String bla() {

        repository.save(new Pet("ID-1", "Bla"));
        repository.save(new Pet("ID-2", "Blubb"));

        List<Pet> all = repository.findAll();
        System.out.println(all);
        return "bla";
    }
}
