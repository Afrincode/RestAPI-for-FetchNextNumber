package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.FetchNextNumber;
import com.rest.service.FetchNextNumberService;

@RestController
public class HomeController {

	@Autowired
	private FetchNextNumberService fetchNextNumberService;
	
	@GetMapping("/FetchNextNumber/{categoryCode}")
	public String home(@PathVariable("categoryCode") long categoryCode)
	{
		return fetchNextNumberService.fetchNextNumberByCategoryCode(categoryCode);
	}
}
