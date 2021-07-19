package com.dio.bootcamp.santander.profissionapi.controller;

import com.dio.bootcamp.santander.profissionapi.model.Person;
import com.dio.bootcamp.santander.profissionapi.repository.ProfessionapiRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/professions")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ControllerProfessionapi {

    private ProfessionapiRepository professionapiRepository;

    @GetMapping
    public ResponseEntity<List<Person>> listAll(){
         List<Person> people = professionapiRepository.findAll();
         if(people.isEmpty()){
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<List<Person>>(people, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> addProduct(@RequestBody @Valid Person person){
        return new ResponseEntity<Person>(professionapiRepository.save(person), HttpStatus.CREATED);
    }
}
