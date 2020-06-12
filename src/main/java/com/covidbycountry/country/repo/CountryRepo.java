package com.covidbycountry.country.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.covidbycountry.country.entity.CountryData;

@Repository
public class CountryRepo {

	@Autowired
	RestTemplate tem;
	
	public List<CountryData> getCountryData(String country) {
		
		ResponseEntity<CountryData[]> response = this.tem.getForEntity("https://api.covid19api.com/country/"+country, CountryData[].class);
		return Arrays.asList(response.getBody());
	}
}