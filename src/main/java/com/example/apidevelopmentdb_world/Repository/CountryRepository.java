package com.example.apidevelopmentdb_world.Repository;

import com.example.apidevelopmentdb_world.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByCode(String countryCode);
}
