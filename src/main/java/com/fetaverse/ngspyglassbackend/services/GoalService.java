package com.fetaverse.ngspyglassbackend.services;

import com.fetaverse.ngspyglassbackend.models.Goal;
import com.fetaverse.ngspyglassbackend.repositories.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoalService {

    @Autowired
    private GoalRepository repository;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Goal> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Goal findById(int id) {
        return repository.findById(id).get();
    }

    public Goal saveGoal(Goal goal) {
        if (goal.getGoal_id() == -1 || goal.getGoal_id() == 0) {
            repository.save(goal);
        } else {
            deleteById(goal.getGoal_id());
            repository.save(goal);
        }
        return goal;
    }

    public Goal updateGoal(Goal goal) {
        return repository.save(goal);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
