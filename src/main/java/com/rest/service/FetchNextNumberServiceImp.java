package com.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.FetchNextNumber;
import com.rest.repository.FetchNextNumberRepository;

@Service
public class FetchNextNumberServiceImp implements FetchNextNumberService
{
	@Autowired
	private FetchNextNumberRepository fetchNextNumberRepository;

	@Override
	public FetchNextNumber fetchNextNumberByCategoryCode(String categoryCode) {
		
		Optional<FetchNextNumber> optional=fetchNextNumberRepository.findById(categoryCode);
		FetchNextNumber fetchNext=null;
		if(optional.isPresent()) {
			fetchNext=optional.get();
		}
		else{
			throw new RuntimeException("Employee not found for the id::"+categoryCode);
		}
		
		return fetchNext;
		
	}

	@Override
	public void saveNextNumber(long nextNumber) {
	
		
	}
	
}
