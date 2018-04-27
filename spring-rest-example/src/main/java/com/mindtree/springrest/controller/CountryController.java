package com.mindtree.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.springrest.bean.Country;
import com.mindtree.springrest.service.CountryService;



@RestController
public class CountryController {
	CountryService countryService = new CountryService();

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getAllCountries() {
		List<Country> listOfAllCountries = countryService.getAllCountries();
		
		listOfAllCountries.forEach(i ->System.out.println(i)); //lambda expression
		
		return listOfAllCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryByID(@PathVariable int id) {
		return countryService.getCountry(id);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.POST, headers = "Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Country updateCountry(@RequestBody Country country) {
		return countryService.updateCountry(country);
	}

	@RequestMapping(value = "/remove-country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable int id) {
		countryService.deleteCountry(id);
	}
}
