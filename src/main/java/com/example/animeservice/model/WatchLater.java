package com.example.animeservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "watch_later")
public class WatchLater implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private User user;

    @Column(name = "watch_later_entity")
    private int watchLaterEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWatchLaterEntity() {
        return watchLaterEntity;
    }

    public void setWatchLaterEntity(int watchLaterEntity) {
        this.watchLaterEntity = watchLaterEntity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "WatchLater [id=" + id + ", watchLaterEntity=" + watchLaterEntity + "]";
    }


}
