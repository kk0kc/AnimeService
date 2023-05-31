package com.example.animeservice.model;

import java.io.Serializable;

public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String fullName;
    private String email;
    private String role;
    private Viewed viewed;
    private WatchLater watchLater;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Viewed getViewed() {
        return viewed;
    }

    public void setViwed(Viewed viewed) {
        this.viewed = viewed;
    }

    public WatchLater getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(WatchLater watchLater) {
        this.watchLater = watchLater;
    }

    @Override
    public String toString() {
        return "UserModel [id=" + id + ", fullName=" + fullName + ", email=" + email + ", role=" + role + "]";
    }

}
