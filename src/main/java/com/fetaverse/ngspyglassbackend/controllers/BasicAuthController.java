package com.fetaverse.ngspyglassbackend.controllers;

import com.fetaverse.ngspyglassbackend.models.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthController {

    @GetMapping("/basicauth")
    public AuthenticationBean basicAuth() {
        return new AuthenticationBean("You are authenticated");

    }
}
