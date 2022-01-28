package com.rest.service;

import java.util.List;

import com.rest.entities.FetchNextNumber;

public interface FetchNextNumberService {

   public FetchNextNumber fetchNextNumberByCategoryCode(String categoryCode);
   public void saveNextNumber(long nextNumber);
}
