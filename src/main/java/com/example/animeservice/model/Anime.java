package com.example.animeservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    @NotBlank(message = "Please Enter the Anime Name")
    private String name;

    @Column(name = "brand")
    @NotBlank(message = "Please Enter the Brand Name")
    private String brand;

    @Column(name = "description")
    @JsonIgnore
    @NotBlank(message = "Please Enter the Anime Description")
    private String description;

    @Column(name = "is_active")
    private boolean active;

    @Column(name = "category_id")
    @JsonIgnore
    private int categoryId;

    @Column(name = "purchases")
    private int purchases;

    @Column(name = "views")
    private int views;

    @Transient
    private MultipartFile file;

    public Anime() {
        this.code = "PRO" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Anime [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", description="
                + description + ", active=" + active
                + ", categoryId=" + categoryId + ", purchases=" + purchases + ", views="
                + views + "]";
    }

}
