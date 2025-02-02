package com.example.apidevelopmentdb_world.Controllers;

import com.example.apidevelopmentdb_world.Errors.CountryNotFoundException;
import com.example.apidevelopmentdb_world.Models.Country;
import com.example.apidevelopmentdb_world.Services.Country.CountryService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country/{countryCode}")
    public Country getACountry(@PathVariable("countryCode") String countryCode) throws CountryNotFoundException {
        return countryService.getACountry(countryCode);
    }
    @GetMapping("/country")
    public Country[] getCountries() throws CountryNotFoundException {
        return countryService.getCountries();
    }
    @PostMapping("/country")
    public Country createCountry(@RequestBody Country country){
        return countryService.createCountry(country);
    }
    @PutMapping("/country/{id}")
    public Country updateCountry(@PathVariable("id") Long id, @RequestBody Country country){
        return countryService.updateCountry(country);
    }
    @DeleteMapping("country/{id}")
    public Country deleteCountry(@PathVariable("id") Long id){
        return countryService.deleteCountry(id);
    }
}
