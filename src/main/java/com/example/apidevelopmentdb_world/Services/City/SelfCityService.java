package com.example.apidevelopmentdb_world.Services.City;

import com.example.apidevelopmentdb_world.Errors.CityNotFoundException;
import com.example.apidevelopmentdb_world.Models.City;
import com.example.apidevelopmentdb_world.Repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfCityService implements CityService{

    CityRepository cityRepository;

    public SelfCityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City getACity(Long id) throws CityNotFoundException {
        Optional<City> res = cityRepository.findById(id);
        if(res.isPresent()){
            return res.get();
        }
        throw new CityNotFoundException(("City Not Found!"));
    }

    @Override
    public City[] getAllCities() {
        List<City> citylist = cityRepository.findAll();
        City[] response = new City[citylist.size()];
        for(int i=0;i<citylist.size();i++){
            response[i] = citylist.get(i);
        }
        return response;
    }

    @Override
    public City createACity(String name, String countrycode, String district, Long population){
        City city = new City();
        city.setName(name);
        city.setCountrycode(countrycode);
        city.setDistrict(district);
        city.setPopulation(population);

        return cityRepository.save(city);
    }

    @Override
    public City updateCity(Long id, String name, String countrycode, String district, Long population) throws CityNotFoundException{
        Optional<City> res = cityRepository.findById(id);
        if(res.isPresent()){
            City city = new City();
            city.setName(name);
            city.setCountrycode(countrycode);
            city.setDistrict(district);
            city.setPopulation(population);
            return cityRepository.save(city);
        }
        throw new CityNotFoundException("City Not Found!");
    }

    @Override
    public City deleteCity(Long id) throws CityNotFoundException{
        Optional<City> res = cityRepository.findById(id);
        if(res.isPresent()){
            cityRepository.delete(res.get());
            return res.get();
        }
        throw new CityNotFoundException("City Not found!");
    }
}
