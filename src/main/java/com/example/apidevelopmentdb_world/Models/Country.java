package com.example.apidevelopmentdb_world.Models;

import com.example.apidevelopmentdb_world.Models.BaseModel.BaseModel;
import jakarta.persistence.Entity;

import java.time.Year;

@Entity
public class Country extends BaseModel {

    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfacearea;
    private Year indepyear;
    private Long population;
    private Double lifeexpectancy;
    private Double GNP;
    private String localname;
    private String governmentform;
    private String headOfstate;
    private Long capital;
    private String code2;


    public Country() {
    }

    public Country(String code, String name, String continent, String region, Double surfacearea, Year indepyear, Long population, Double lifeexpectancy, Double GNP, String localname, String governmentform, String headOfstate, Long capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfacearea = surfacearea;
        this.indepyear = indepyear;
        this.population = population;
        this.lifeexpectancy = lifeexpectancy;
        this.GNP = GNP;
        this.localname = localname;
        this.governmentform = governmentform;
        this.headOfstate = headOfstate;
        this.capital = capital;
        this.code2 = code2;
    }

    public Country(Long id, String code, String name, String continent, String region, Double surfacearea, Year indepyear, Long population, Double lifeexpectancy, Double GNP, String localname, String governmentform, String headOfstate, Long capital, String code2) {
        super(id);
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfacearea = surfacearea;
        this.indepyear = indepyear;
        this.population = population;
        this.lifeexpectancy = lifeexpectancy;
        this.GNP = GNP;
        this.localname = localname;
        this.governmentform = governmentform;
        this.headOfstate = headOfstate;
        this.capital = capital;
        this.code2 = code2;
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

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(Double surfacearea) {
        this.surfacearea = surfacearea;
    }

    public Year getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(Year indepyear) {
        this.indepyear = indepyear;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(Double lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform;
    }

    public String getHeadOfstate() {
        return headOfstate;
    }

    public void setHeadOfstate(String headOfstate) {
        this.headOfstate = headOfstate;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
