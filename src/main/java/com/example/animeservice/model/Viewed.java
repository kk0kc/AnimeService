package com.example.animeservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "viewed")
public class Viewed implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private User user;
    @Column(name = "viewed_unit")
    private int viewedUnit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getViewedUnit() {
        return viewedUnit;
    }

    public void setViewedUnit(int watchEntity) {
        this.viewedUnit = watchEntity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Viewed [id=" + id + ", viewedUnit=" + viewedUnit + "]";
    }

}
