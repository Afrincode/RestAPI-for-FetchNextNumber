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
	public String fetchNextNumberByCategoryCode(String categoryCode) {
		
		long oldValue;
		Optional<FetchNextNumber> optional=fetchNextNumberRepository.findById(categoryCode);
		FetchNextNumber fetchNext=null;
		if(optional.isPresent()) {
			fetchNext=optional.get();
			oldValue=fetchNext.getValue();
		}
		else{
			oldValue=0;
		}
		long nextValue=computeNextNumber(oldValue);
		return " Old Value: "+oldValue+"  New Value: "+nextValue;
		
		
	}

	private long computeNextNumber(long oldValue) {
		// TODO Auto-generated method stub
		long nextValue=0;
		
		return nextValue;
	}

	@Override
	public void saveNextNumber(long nextNumber) {
	
		
	}
	
}
