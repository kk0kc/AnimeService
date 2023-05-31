package com.example.animeservice.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_detail")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Please Enter Name!")
    private String firstName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "role")
    private String role;

    @Column(name = "password")
    @NotBlank(message = "Please Enter Password for Login!")
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name = "enabled")
    private boolean enabled = true;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Viewed viewed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Viewed getViewed() {
        return viewed;
    }

    public void setViewed(Viewed viewed) {
        this.viewed = viewed;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private WatchLater watchLater;

    public WatchLater getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(WatchLater watchLater) {
        this.watchLater = watchLater;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", email=" + email
                + ", role=" + role + ", password=" + password + ", enabled="
                + enabled + "]";
    }

}
