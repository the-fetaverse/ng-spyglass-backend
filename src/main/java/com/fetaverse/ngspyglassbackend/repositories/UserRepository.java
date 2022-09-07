package com.fetaverse.ngspyglassbackend.repositories;

import com.fetaverse.ngspyglassbackend.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    public User findByUsername(String username);
}
