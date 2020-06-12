package com.covidbycountry.country.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidbycountry.country.entity.CountryData;
import com.covidbycountry.country.repo.CountryRepo;

@RestController
@RequestMapping("/bycountry")
public class ByCountryController {
	
	@Autowired
	CountryRepo repo;

	@GetMapping(path="/{country}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<CountryData> getCountryData(@PathVariable("country") String country) {
		return this.repo.getCountryData(country);
	}
}
