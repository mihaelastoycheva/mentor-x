package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HomeController {
    private final UserDao userDao;
    public HomeController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/posttest")
    public String postBody(@RequestBody String fullName) {
        return "Hello " + fullName;
    }

    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String postBody(@RequestBody Users person) {
        userDao.createUser(person.getUsername(), person.getPassword(), person.getFirstName(), person.getLastName());
        return person.getFirstName();
    }

}

