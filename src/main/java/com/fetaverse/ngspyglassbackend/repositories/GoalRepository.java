package com.fetaverse.ngspyglassbackend.repositories;

import com.fetaverse.ngspyglassbackend.models.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Integer> {

    List<Goal> findByUsername(String username);
}
