package com.example.animeservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "watch_later_entity")
public class WatchLaterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Anime anime;

    @Column(name = "watch_later_id")
    private int watchLaterId;

    @Column(name = "is_available")
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWatchLaterId() {
        return watchLaterId;
    }

    public void setWatchLaterId(int watchLaterId) {
        this.watchLaterId = watchLaterId;
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
        return "Anime [id=" + id + ", watchLaterId=" + watchLaterId + ", animeCount=" + ", isAvailable=" + isAvailable + "]";
    }
}
