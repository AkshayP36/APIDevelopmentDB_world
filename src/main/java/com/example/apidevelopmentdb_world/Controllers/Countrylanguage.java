package com.example.apidevelopmentdb_world.Controllers;

import com.example.apidevelopmentdb_world.Errors.CountrylanguageNotFoundException;
import com.example.apidevelopmentdb_world.Models.Country;
import com.example.apidevelopmentdb_world.Services.Countrylanguage.CountrylanguageService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
public class Countrylanguage {

    CountrylanguageService countrylanguageService;

    public Countrylanguage(CountrylanguageService countrylanguageService) {
        this.countrylanguageService = countrylanguageService;
    }

    public Countrylanguage() {

    }

    @GetMapping("/countrylanguage/{countrycode}")
    public Countrylanguage getACountrylanguage(String countrycode) throws CountrylanguageNotFoundException {
        return countrylanguageService.getACountrylanguage(countrycode);
    }
    @GetMapping("/countrylanguage")
    public Countrylanguage[] getAllCountryLanguages() throws CountrylanguageNotFoundException {
        return countrylanguageService.getAllCountryLanguages();
    }

    @PostMapping("/countrylanguage")
    public Countrylanguage createACountrylanguage(@RequestBody Countrylanguage countrylanguage){
        return countrylanguageService.createACountrylanguage(countrylanguage);
    }

    @PutMapping("/countrylanguage/{countrycode}")
    public Countrylanguage updateACountrylanguage(@PathVariable("countrycode") String countrycode, @RequestBody Countrylanguage countrylanguage){
        return countrylanguageService.updateACountrylanguage(countrylanguage);
    }

    @DeleteMapping("/countrylanguage/{countrycode}")
    public Countrylanguage deleteACountrylanguage(@PathVariable("countrycode") String countrycode){
        return countrylanguageService.deleteACountrylanguage(countrycode);
    }

}
