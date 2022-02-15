package com.aviasales.demo.entity;

public class Opersales {
    private String name;
    private String description;
    private String ageCategory;
    private Integer place;


    public Opersales(String name, String description, String ageCategory, Integer place) {
        this.name = name;
        this.description = description;
        this.ageCategory = ageCategory;
        this.place = place;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public Integer getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Opersales{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ageCategory='" + ageCategory + '\'' +
                ", place=" + place +
                '}';
    }


}