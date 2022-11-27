package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Controller
@RequestMapping(path="/students")

public class StudentsController {
    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping(path="/all")
    public Iterable findAll() {
        return studentsRepository.findAll();
    }
}
