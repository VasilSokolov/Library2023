package org.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Author {

    private Long id;
    private String name; //mandatory
    private String country;
    private LocalDateTime createdOn; //mandatory - create
    private LocalDate updatedOn; //mandatory - update
    private boolean isDeleted;

    public Author() {
    }

    public Author(String name, LocalDateTime createdOn) {
        this.name = name;
        this.createdOn = createdOn;
    }

    public Author(String name, String country, LocalDateTime createdOn) {
        this.name = name;
        this.country = country;
        this.createdOn = createdOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
