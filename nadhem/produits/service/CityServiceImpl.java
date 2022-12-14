package com.nadhem.produits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.produits.entities.City;
import com.nadhem.produits.entities.Country;
import com.nadhem.produits.repos.CityRepository;
import com.nadhem.produits.repos.CountraisRepository;


@Service
public class CityServiceImpl implements CityService{

	@Autowired
	CityRepository cityRepository;
	
	
	
	@Override
	public City saveCity(City p) {	
		return cityRepository.save(p);
	}

	@Override
	public City updateCity(City p) {
		return cityRepository.save(p);
	}

	@Override
	public void deleteCity(City p) {
		cityRepository.delete(p);
		
	}

	@Override
	public void deleteCityById(Long id) {
		cityRepository.deleteById(id);
		
	}

	@Override
	public City getCity(Long id) {
		return cityRepository.findById(id).get();
	}

	@Override
	public List<City> getAllCity() {
		
		return cityRepository.findAll();
	}
	@Override
	public List<City> findByNomCity(String nom) {
		
		return cityRepository.findByNomCity(nom);
	}

	@Override
	public List<City> findByNomCityContains(String nom) {
		
		return cityRepository.findByNomCityContains(nom);
	}

	@Override
	public List<City> findByNomspace(String nom, Double space) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findByCountry(Country country) {
		
		return cityRepository.findByCountry(country);
	}
	@Override
	public List<City> findByCountryIdCountry(Long id) {
	
		return cityRepository.findByCountryIdCountry(id);
	}
	@Override
	public List<City> findByOrderByNomCityAsc() {
		
		return cityRepository.findByOrderByNomCityAsc();
	}

	@Override
	public List<City> trierCityNomsspace() {
	
		return cityRepository.trierCityNomsspace();
	}
	
	

}
