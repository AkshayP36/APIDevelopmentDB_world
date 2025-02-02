package com.example.apidevelopmentdb_world.Services.Country;

import com.example.apidevelopmentdb_world.Errors.CountryNotFoundException;
import com.example.apidevelopmentdb_world.Models.Country;
import com.example.apidevelopmentdb_world.Repository.CityRepository;
import com.example.apidevelopmentdb_world.Repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfCountryService implements CountryService {

    CountryRepository countryRepository;

    public SelfCountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getACountry(String countryCode) throws CountryNotFoundException {
        Optional<Country> res = countryRepository.findByCode(countryCode);
        if(res.isPresent()){
            return res.get();
        }
        throw new CountryNotFoundException("Country Not Found!");
    }

    @Override
    public Country[] getCountries() throws CountryNotFoundException{
        List<Country> res = countryRepository.findAll();
        if(!res.isEmpty()){
            Country[] countrylist = new Country[res.size()];
            for(int i=0; i<res.size(); i++){
                countrylist[i] = res.get(i);
            }
            return countrylist;
        }
        throw new CountryNotFoundException("No Country present!");
    }

    @Override
    public Country createCountry(Country country) {
        return null;
    }

    @Override
    public Country updateCountry(Country country) {
        return null;
    }

    @Override
    public Country deleteCountry(Long id) {
        return null;
    }
}
