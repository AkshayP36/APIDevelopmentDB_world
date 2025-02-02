package com.example.apidevelopmentdb_world.Services.Country;

import com.example.apidevelopmentdb_world.Errors.CountryNotFoundException;
import com.example.apidevelopmentdb_world.Models.Country;

public interface CountryService {
    Country getACountry(String countryCode) throws CountryNotFoundException;
    Country[] getCountries() throws CountryNotFoundException;
    Country createCountry(Country country);
    Country updateCountry(Country country);
    Country deleteCountry(Long id);
}
