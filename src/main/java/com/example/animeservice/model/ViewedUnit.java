package com.example.animeservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "viewed_unit")
public class ViewedUnit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Anime anime;

    @Column(name = "viewed_id")
    private int viewedId;

    @Column(name = "is_available")
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getViewedId() {
        return viewedId;
    }

    public void setViewedId(int viewedId) {
        this.viewedId = viewedId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    @Override
    public String toString() {
        return "Anime [id=" + id + ", viewedId=" + viewedId + ", animeCount=" + ", isAvailable=" + isAvailable + "]";
    }
}
