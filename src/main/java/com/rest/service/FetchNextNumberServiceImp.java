package com.rest.service;

import java.util.List;
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
		long id=0;
		List<FetchNextNumber> list=fetchNextNumberRepository.findAll();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getCategoryCode()==categoryCode)
			{
				id=list.get(i).getId();
			}
		}
		Optional<FetchNextNumber> optional=fetchNextNumberRepository.findById(id);
		FetchNextNumber fetchNext=null;
		if(optional.isPresent()) {
			fetchNext=optional.get();
			oldValue=fetchNext.getValue();
		}
		else{
			oldValue=0;
		}
		long nextValue=computeNextNumber(oldValue);
		saveNextNumber(nextValue,categoryCode);
		return " Old Value: "+oldValue+"  New Value: "+nextValue;
		
		
	}

	private long computeNextNumber(long oldValue) {
		// TODO Auto-generated method stub
		long nextValue=0;
		try {
			
			Thread.sleep(5000);
			long num;
			if(oldValue==0){
				nextValue=10;
			}
			else{
				nextValue=oldValue+9;
			}
				
		}catch(Exception e) {System.out.println(e);}
		return nextValue;
	}

	@Override
	public void saveNextNumber(long nextValue,String categoryCode) {
	
		FetchNextNumber newfetchNumObj=new FetchNextNumber();
		newfetchNumObj.setValue(nextValue);
		newfetchNumObj.setCategoryCode(categoryCode);
		fetchNextNumberRepository.save(newfetchNumObj);
	}
	
}
