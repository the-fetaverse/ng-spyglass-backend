package com.fetaverse.ngspyglassbackend.models;

import java.util.Date;

public class Goal {
    // FIELDS
    private int goal_id;
    private String name;
    private String description;
    private Date date_created;
    private Date date_target;
    private double amount_current;
    private double amount_target;
    private boolean flag_achieved;

    // CONSTRUCTORS

    /**
     * Default constructor:
     */
    public Goal() {
    }

    /**
     * Full args constructor:
     * @param goal_id: id
     * @param name: String
     * @param description: String
     * @param date_created: Date
     * @param date_target: Date
     * @param amount_current: double
     * @param amount_target: double
     * @param flag_achieved: boolean
     */
    public Goal(int goal_id, String name, String description, Date date_created, Date date_target, double amount_current, double amount_target, boolean flag_achieved) {
        this.goal_id = goal_id;
        this.name = name;
        this.description = description;
        this.date_created = date_created;
        this.date_target = date_target;
        this.amount_current = amount_current;
        this.amount_target = amount_target;
        this.flag_achieved = flag_achieved;
    }

    /**
     * Custom constructor: all args EXCEPT id:
     * @param name: String
     * @param description: String
     * @param date_created: Date
     * @param date_target: Date
     * @param amount_current: double
     * @param amount_target: double
     * @param flag_achieved: boolean
     */
    public Goal(String name, String description, Date date_created, Date date_target, double amount_current, double amount_target, boolean flag_achieved) {
        this.name = name;
        this.description = description;
        this.date_created = date_created;
        this.date_target = date_target;
        this.amount_current = amount_current;
        this.amount_target = amount_target;
        this.flag_achieved = flag_achieved;
    }

    // GETTERS

    /**
     * Gets goal id:
     * @return int goal_id
     */
    public int getGoal_id() {
        return goal_id;
    }

    /**
     * Gets goal name:
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets goal description:
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets date created:
     * @return Date date_created
     */
    public Date getDate_created() {
        return date_created;
    }

    /**
     * Gets target date:
     * @return Date date_target
     */
    public Date getDate_target() {
        return date_target;
    }

    /**
     * Gets current amount:
     * @return double amount_current
     */
    public double getAmount_current() {
        return amount_current;
    }

    /**
     * Gets target amount:
     * @return double amount_target
     */
    public double getAmount_target() {
        return amount_target;
    }

    /**
     * Gets flag if goal is achieved:
     * @return boolean flag_achieved
     */
    public boolean isFlag_achieved() {
        return flag_achieved;
    }

    // SETTERS

    /**
     * Sets goal id:
     * @param goal_id: int
     */
    public void setGoal_id(int goal_id) {
        this.goal_id = goal_id;
    }

    /**
     * Sets goal name:
     * @param name: String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets goal description:
     * @param description: String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the date the goal was created:
     * @param date_created: Date
     */
    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    /**
     * Sets the target date for the goal:
     * @param date_target: Date
     */
    public void setDate_target(Date date_target) {
        this.date_target = date_target;
    }

    /**
     * Sets the current amount saved:
     * @param amount_current: double
     */
    public void setAmount_current(double amount_current) {
        this.amount_current = amount_current;
    }

    /**
     * Sets the target amount budgeted:
     * @param amount_target: double
     */
    public void setAmount_target(double amount_target) {
        this.amount_target = amount_target;
    }

    /**
     * Sets the flag if the goal was achieved:
     * @param flag_achieved: boolean
     */
    public void setFlag_achieved(boolean flag_achieved) {
        this.flag_achieved = flag_achieved;
    }

    // EQUALS and HASHCODE

    /**
     * Equals based on goal_id since it's a unique value:
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goal)) return false;

        Goal goal = (Goal) o;

        return getGoal_id() == goal.getGoal_id();
    }

    /**
     * HashCode based on goal_id since it's a unique value
     * @return int
     */
    @Override
    public int hashCode() {
        return getGoal_id();
    }

    // TO STRING

    /**
     * To string with full args
     * @return String
     */
    @Override
    public String toString() {
        return "Goal{" +
                "goal_id=" + goal_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date_created=" + date_created +
                ", date_target=" + date_target +
                ", amount_current=" + amount_current +
                ", amount_target=" + amount_target +
                ", flag_achieved=" + flag_achieved +
                '}';
    }
}
