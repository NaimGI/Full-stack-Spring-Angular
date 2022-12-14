package com.nadhem.produits.service;

import java.util.List;


import com.nadhem.produits.entities.City;
import com.nadhem.produits.entities.Country;


public interface CityService {
	City saveCity(City p);
	City updateCity(City p);
	void deleteCity(City p);
	void deleteCityById(Long id);
	City  getCity(Long id);
	List<City> getAllCity();
	List<City> findByNomCity(String nom);
	List<City> findByNomCityContains(String nom);
	List<City> findByNomspace(String nom, Double space);
	List<City> findByCountry(Country country);
	List<City> findByCountryIdCountry(Long id);
	List<City> findByOrderByNomCityAsc();
	List<City> trierCityNomsspace();

}
