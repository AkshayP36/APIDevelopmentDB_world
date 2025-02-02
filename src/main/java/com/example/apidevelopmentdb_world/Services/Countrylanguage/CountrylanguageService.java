package com.example.apidevelopmentdb_world.Services.Countrylanguage;

import com.example.apidevelopmentdb_world.Controllers.Countrylanguage;
import com.example.apidevelopmentdb_world.Errors.CountrylanguageNotFoundException;

public interface CountrylanguageService {

    Countrylanguage getACountrylanguage(String countrycode) throws CountrylanguageNotFoundException;
    Countrylanguage[] getAllCountryLanguages() throws CountrylanguageNotFoundException;
    Countrylanguage createACountrylanguage(Countrylanguage countrylanguage);
    Countrylanguage updateACountrylanguage(Countrylanguage countrylanguage);
    Countrylanguage deleteACountrylanguage(String countrycode);
}
