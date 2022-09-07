package com.fetaverse.ngspyglassbackend.controllers;

import com.fetaverse.ngspyglassbackend.models.User;
import com.fetaverse.ngspyglassbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users/{username}")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public User findUserByUsername(@PathVariable String username) {
        return service.findUserByUsername(username);
    }
}
