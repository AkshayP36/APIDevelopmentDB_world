package com.example.apidevelopmentdb_world.Models;

import com.example.apidevelopmentdb_world.Models.BaseModel.BaseModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Countrylanguage extends BaseModel {

    private String countrycode;
    private String language;
    private String isofficial;
    private Double percentage;

    public Countrylanguage() {
    }

    public Countrylanguage(Long id) {
        super(id);
    }

    public Countrylanguage(String countrycode, String language, String isofficial, Double percentage) {
        this.countrycode = countrycode;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    public Countrylanguage(Long id, String countrycode, String language, String isofficial, Double percentage) {
        super(id);
        this.countrycode = countrycode;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
