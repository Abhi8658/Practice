package com.mindtree.springrest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.springrest.bean.Country;

@Service
public class CountryService {
	static HashMap<Integer, Country> countryIdMap = getCountryIdMap();

	public CountryService() {
		super();
		if (countryIdMap == null) {
			countryIdMap = new HashMap<Integer, Country>();
			// creating some objects of country while initializing
			countryIdMap.put(1, new Country(001, "India", 1200000000));
			countryIdMap.put(2, new Country(002, "USA", 200000000));
			countryIdMap.put(3, new Country(003, "London", 400000000));
			countryIdMap.put(4, new Country(004, "Pakistan", 1000000000));
			countryIdMap.put(5, new Country(005, "China", 200000000));

		}
	}

	public List<Country> getAllCountries() {
		List<Country> countries = new ArrayList<>(countryIdMap.values());
		return countries;
	}

	public Country getCountry(int id) {
		Country country = countryIdMap.get(id);
		return country;
	}

	public Country addCountry(Country country) {
		country.setId(getMaxId() + 1);
		countryIdMap.put(country.getId(), country);
		return country;
	}

	public Country updateCountry(Country country) {
		if (country.getId() <= 0)
			return null;
		countryIdMap.put(country.getId(), country);
		return country;
	}

	public void deleteCountry(int id) {
		countryIdMap.remove(id);
	}

	public static HashMap<Integer, Country> getCountryIdMap() {
		return countryIdMap;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : countryIdMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
