package com.fetaverse.ngspyglassbackend.services;

import com.fetaverse.ngspyglassbackend.models.User;
import com.fetaverse.ngspyglassbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findUserByUsername(String username) {
        return repository.findByUsername(username);
    }
}
