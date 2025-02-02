package com.example.apidevelopmentdb_world.Models;

import com.example.apidevelopmentdb_world.Models.BaseModel.BaseModel;
import jakarta.persistence.Entity;

@Entity
public class City extends BaseModel {

    private String name;
    private String district;
    private Long population;
    private String countrycode;

    public City() {
    }

    public City(String name, String countrycode, String district, Long population) {
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
