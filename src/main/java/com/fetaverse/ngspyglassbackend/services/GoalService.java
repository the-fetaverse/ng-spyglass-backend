package com.fetaverse.ngspyglassbackend.services;

import com.fetaverse.ngspyglassbackend.models.Goal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class GoalService {
    private static ArrayList<Goal> goals = new ArrayList<>();

    static {
        goals.add(new Goal(1,
                "PS5",
                "Saving for a new playstation 5",
                "dmjohnspor@gmail.com",
                new Date(),
                new Date(),
                0,
                500.00,
                false)
        );
        goals.add(new Goal(2,
                "Trip to Spain",
                "Summer trip to Spain",
                "dmjohnspor@gmail.com",
                new Date(),
                new Date(),
                0,
                2500.00,
                false)
        );
    }

public ArrayList<Goal> findAll() {
        return goals;
}
}
