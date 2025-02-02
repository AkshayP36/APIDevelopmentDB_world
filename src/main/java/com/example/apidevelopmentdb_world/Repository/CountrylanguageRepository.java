package com.example.apidevelopmentdb_world.Repository;

import com.example.apidevelopmentdb_world.Controllers.Countrylanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountrylanguageRepository extends JpaRepository<Countrylanguage, Long> {

    Optional<Countrylanguage> findByCountrycode(String countrycode);
}
