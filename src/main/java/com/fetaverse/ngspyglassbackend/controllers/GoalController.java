package com.fetaverse.ngspyglassbackend.controllers;

import com.fetaverse.ngspyglassbackend.models.Goal;
import com.fetaverse.ngspyglassbackend.repositories.GoalRepository;
import com.fetaverse.ngspyglassbackend.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users/{username}/goals")
public class GoalController {

    @Autowired
    private GoalService service;

    @Autowired
    private GoalRepository repository;

    /**
     * Gets all goals for a username.
     * GET mapping: "/users/{username}/goals"
     * @param username the username logged in
     * @return a list of goals
     */
    @GetMapping
    public List<Goal> findAll(@PathVariable String username) {
        return service.findByUsername(username);
    }

    /**
     * Gets a specific goal by its id.
     * GET mappingL "/users/{username}/goals/{id}"
     * @param id The goal id
     * @return the goal for that specific id
     */
    @GetMapping("/{id}")
    public Goal findById(@PathVariable int id) {
        return service.findById(id);
    }

    /**
     * Saves a new goal in the db.
     * POST mapping: "/users/{username}/goals"
     * @param username The usenrname logged in
     * @param goal The goal to be saved
     * @return The goal that was saved
     */
    @PostMapping
    public ResponseEntity<Void> createGoal(@PathVariable String username, @RequestBody Goal goal) {
        Goal newGoal = service.saveGoal(goal);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newGoal.getGoal_id())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    /**
     * Updates a specific goal defined by its id.
     * PUT mapping: "/users/{username}/goals/{id}"
     * @param username The username logged in
     * @param id The id of the goal to be updated
     * @param goal The goal with the new information
     * @return The updated goal
     */
    @PutMapping("/{id}")
    public Goal updateGoal(@PathVariable String username, @PathVariable int id, @RequestBody Goal goal) {
        goal.setGoal_id(id);
        goal.setUsername(username);
        return service.updateGoal(goal);

    }

    /**
     * Deletes a specific goal defined by its id
     * DELETE mapping: "/users/{username}/goals/{id}"
     * @param id The id of the goal to be deleted
     * @return A response
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGoal(@PathVariable int id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
