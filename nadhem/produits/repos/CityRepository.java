package com.nadhem.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadhem.produits.entities.City;
import com.nadhem.produits.entities.Country;

 @RepositoryRestResource ( path = "rest")
public interface CityRepository extends JpaRepository<City, Long> {
	List<City> findByNomCity(String nom);
	List<City> findByNomCityContains(String nom);
	@Query("select p from City p where p.nomCity like %:nom and p.space > :space")
	List<City> findByNomspace (@Param("nom") String nom,@Param("space") Double space);

   @Query("SELECT p from City p where p.country=?1")
	List<City> findByCountry(Country country);
	
	List<City> findByCountryIdCountry(Long id);
	
	List<City> findByOrderByNomCityAsc();
	
	@Query("select p from City p order by p.nomCity ASC, p.space DESC")
	List<City> trierCityNomsspace();
}
