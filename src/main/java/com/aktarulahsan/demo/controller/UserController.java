package com.aktarulahsan.demo.controller;

import com.aktarulahsan.demo.model.User;
import com.aktarulahsan.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "Welcome") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/findById")
    public User findTourById(@RequestParam("fname") String fname,@RequestParam("lname") String lname) {
        return repository.findById(fname, lname);
    }

    @PostMapping("/getdata")
    public User saveData(@RequestBody String reqObj) {
        return  repository.save(reqObj);
//        return String.format("Hello %s!",  reqObj);
    }

}
