package com.example.apidevelopmentdb_world.Controllers;

import com.example.apidevelopmentdb_world.Errors.CityNotFoundException;
import com.example.apidevelopmentdb_world.Models.City;
import com.example.apidevelopmentdb_world.Services.City.CityService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city/{id}")
    public City getACity(@PathVariable("id") Long id) throws CityNotFoundException{
        return cityService.getACity(id);
    }

    @GetMapping("/city")
    public City[] getAllCities(){

        return cityService.getAllCities();
    }


    @PostMapping("/city")
    public City createACity(@RequestBody City city){
        return cityService.createACity(city.getName(), city.getCountrycode(), city.getDistrict(), city.getPopulation());
    }
    @DeleteMapping("/city/{id}")
    public City deleteCity(@PathVariable("id") Long id) throws CityNotFoundException{
        return cityService.getACity(id);
    }
    @PutMapping("/city/{id}")
    public City updateCity(@PathVariable("id") Long id, @RequestBody City city) throws CityNotFoundException{
        return cityService.updateCity(id, city.getName(), city.getCountrycode(), city.getDistrict(), city.getPopulation());
    }

}
