package com.covidbycountry.country.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryData {

	
	private @JsonProperty("Country") String Country;
	private @JsonProperty("CountryCode") String CountryCode;
	private @JsonProperty("Province") String Province;
	private @JsonProperty("City") String City;
	private @JsonProperty("CityCode") String CityCode;
	private @JsonProperty("Confirmed") int Confirmed;
	private @JsonProperty("Deaths") int Deaths;
	private @JsonProperty("Recovered") int Recovered;
	private @JsonProperty("Active") int Active;
	private @JsonProperty("Date") String Date;
	
	public CountryData() {
		
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCityCode() {
		return CityCode;
	}
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}
	public int getConfirmed() {
		return Confirmed;
	}
	public void setConfirmed(int confirmed) {
		Confirmed = confirmed;
	}
	public int getDeaths() {
		return Deaths;
	}
	public void setDeaths(int deaths) {
		Deaths = deaths;
	}
	public int getRecovered() {
		return Recovered;
	}
	public void setRecovered(int recovered) {
		Recovered = recovered;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public CountryData(String country, String countryCode, String province, String city, String cityCode, int confirmed,
			int deaths, int recovered, int active, String date) {
		super();
		Country = country;
		CountryCode = countryCode;
		Province = province;
		City = city;
		CityCode = cityCode;
		Confirmed = confirmed;
		Deaths = deaths;
		Recovered = recovered;
		Active = active;
		Date = date;
	}
	
	
}
