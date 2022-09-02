package com.fetaverse.ngspyglassbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    // FIELDS

    @Id
    @Column
    @JoinColumn(name = "username")
    private String username;

    @Column
    private String password;

    @Column
    private boolean enabled;

    // CONSTRUCTORS

    /**
     * Default constructor:
     */
    public User() {
    }

    /**
     * Full args constructor:
     * @param username String
     * @param password String
     * @param enabled boolean
     */
    public User(String username, String password, boolean enabled, String first_name, String last_name) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    // GETTERS

    /**
     * Gets username (which is email):
     * @return username: String
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password:
     * @return password: String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets flag if the user is authenticated:
     * @return enabled: boolean
     */
    public boolean isEnabled() {
        return enabled;
    }


    // SETTERS

    /**
     * Sets the email as username:
     * @param username String
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password:
     * @param password String
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the flag to true if the user is logged in
     * @param enabled boolean
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // EQUALS and HASHCODE

    /**
     * Equals method based on the username since it will have to be unique:
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getUsername().equals(user.getUsername());
    }

    /**
     * HashCode method based on the username since it will have to be unique:
     * @return int
     */
    @Override
    public int hashCode() {
        return getUsername().hashCode();
    }

    // TO STRING

    /**
     * ToString method with full args
     * @return String
     */
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
