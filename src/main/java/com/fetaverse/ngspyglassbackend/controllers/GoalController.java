package com.fetaverse.ngspyglassbackend.controllers;

import com.fetaverse.ngspyglassbackend.models.Goal;
import com.fetaverse.ngspyglassbackend.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users/{username}")
public class GoalController {

    @Autowired
    private GoalService service;

    @GetMapping("/goals")
    public List<Goal> findAll(@PathVariable String username) {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Goal findById(@PathVariable String username, @PathVariable int id) {
        return null;
    }

    @PostMapping
    public Goal createGoal(@PathVariable String username, @RequestBody Goal goal) {
        return null;
    }

    @PutMapping("/goals/{id}")
    public Goal updateGoal(@PathVariable String username, @PathVariable int id, @RequestBody Goal goal) {
        goal.setGoal_id(id);
        return null;
    }

    @DeleteMapping("/goals/{id}")
    public ResponseEntity<Void> deleteGoal(@PathVariable String username, @PathVariable int id) {
        Goal goal = service.deleteById(id);
        if (goal != null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
