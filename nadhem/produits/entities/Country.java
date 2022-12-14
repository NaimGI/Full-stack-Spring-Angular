package com.nadhem.produits.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCountry;
	private String nomCountry;;
	private Date dateCreation;

	
	@OneToMany (mappedBy = "country")
	@JsonIgnore
	private List<City> City;
	
	
	
	
	
	
	
	
	

}
