package com.rest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rest.entities.FetchNextNumber;
import com.rest.repository.FetchNextNumberRepository;
import com.rest.service.FetchNextNumberService;

@SpringBootTest
class FetchNumberRestApiApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private FetchNextNumberService fetchNextNumberService;
	@Test
	public void computeNextNumberTest()
	{
		long expected=10;
		long actualValue=fetchNextNumberService.computeNextNumber(0);
		
		assertThat(actualValue).isEqualTo(expected);
	}
	
	@Autowired
	private FetchNextNumberRepository fetchNextNumberRepository;
	@Test
	public void saveNextNumberTest()
	{
		long expected=10;
		fetchNextNumberService.saveNextNumber(10,102);

		Optional<FetchNextNumber> optional=fetchNextNumberRepository.findById((long) 102);
		
		FetchNextNumber fetchObj=optional.get();
		long actual=fetchObj.getValue();
		
		assertThat(actual).isEqualTo(expected);
	}
	
//	@Test
//	public void fetchNextNumberByCategoryCodeTest()
//	{
//		
//	}

}
