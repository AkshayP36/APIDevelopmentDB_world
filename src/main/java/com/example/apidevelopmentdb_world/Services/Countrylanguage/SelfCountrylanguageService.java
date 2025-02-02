package com.example.apidevelopmentdb_world.Services.Countrylanguage;

import com.example.apidevelopmentdb_world.Controllers.Countrylanguage;
import com.example.apidevelopmentdb_world.Errors.CountrylanguageNotFoundException;
import com.example.apidevelopmentdb_world.Repository.CountrylanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfCountrylanguageService implements CountrylanguageService{

    CountrylanguageRepository countrylanguageRepository;

    public SelfCountrylanguageService(CountrylanguageRepository countrylanguageRepository) {
        this.countrylanguageRepository = countrylanguageRepository;
    }

    @Override
    public Countrylanguage getACountrylanguage(String countrycode) throws CountrylanguageNotFoundException{
        Optional<Countrylanguage> res = countrylanguageRepository.findByCountrycode(countrycode);
        if(res.isPresent()){
            return res.get();
        }
        throw new CountrylanguageNotFoundException("Country language not found!");
    }

    @Override
    public Countrylanguage[] getAllCountryLanguages() throws CountrylanguageNotFoundException{
        List<Countrylanguage> res = countrylanguageRepository.findAll();
        if(!res.isEmpty()){
            Countrylanguage[] countrylanguageslist = new Countrylanguage[res.size()];
            for(int i=0; i<res.size(); i++){
                countrylanguageslist[i] = res.get(i);
            }
            return countrylanguageslist;
        }
        throw new CountrylanguageNotFoundException("Country language not found");
    }

    @Override
    public Countrylanguage createACountrylanguage(Countrylanguage countrylanguage) {
        Countrylanguage cl = new Countrylanguage();
        return null;
    }

    @Override
    public Countrylanguage updateACountrylanguage(Countrylanguage countrylanguage) {
        return null;
    }

    @Override
    public Countrylanguage deleteACountrylanguage(String countrycode) {
        return null;
    }
}
