package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Controller
@RequestMapping(path="/mentors")
public class MentorsController {
    @Autowired
    private MentorsRepository mentorsRepository;

    @GetMapping(path="/all")
    public Iterable findAll() {
        return mentorsRepository.findAll();
    }
}
