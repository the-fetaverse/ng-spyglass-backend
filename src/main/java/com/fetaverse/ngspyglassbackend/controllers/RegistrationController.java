//package com.fetaverse.ngspyglassbackend.controllers;
//
//import com.fetaverse.ngspyglassbackend.DTO.UserDTO;
//import com.fetaverse.ngspyglassbackend.services.RegistrationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RegistrationController {
//
//    @Autowired
//    private RegistrationService service;
//
//    @PostMapping("/register")
//    public void register(@RequestBody UserDTO user) {
//        service.register(user.getUsername(), user.getPassword());
//    }
//}
