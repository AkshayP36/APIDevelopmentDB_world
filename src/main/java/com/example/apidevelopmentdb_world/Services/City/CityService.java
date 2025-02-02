package com.example.apidevelopmentdb_world.Services.City;

import com.example.apidevelopmentdb_world.Errors.CityNotFoundException;
import com.example.apidevelopmentdb_world.Models.City;

public interface CityService {

    City getACity(Long id) throws CityNotFoundException;
    City[] getAllCities();
    City createACity(String name, String countrycode, String district, Long population);
    City updateCity(Long id, String name, String countrycode, String district, Long population) throws CityNotFoundException;
    City deleteCity(Long id) throws CityNotFoundException;

}
