package com.rest.service;

import java.util.List;

import com.rest.entities.FetchNextNumber;

public interface FetchNextNumberService {

   public String fetchNextNumberByCategoryCode(String categoryCode);
   public void saveNextNumber(long nextNumber,String categoryCode);
}
