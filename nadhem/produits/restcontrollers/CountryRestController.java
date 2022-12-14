package com.nadhem.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.produits.entities.City;
import com.nadhem.produits.entities.Country;
import com.nadhem.produits.repos.CountraisRepository;

@RestController
@RequestMapping("/api/c")
@CrossOrigin
public class CountryRestController {
	@Autowired
	CountraisRepository countraisRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Country> getAllCountry()
	{
	return countraisRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Country getCountraiById(@PathVariable("id") Long id) {
	return countraisRepository.findById(id).get();
	}
	@RequestMapping(method = RequestMethod.POST)
	public Country createCountry(@RequestBody Country country) {
			return countraisRepository.save(country);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void  DeletedCountry (@PathVariable("id") Long id) {
	  countraisRepository.deleteById(id);
	}
}
