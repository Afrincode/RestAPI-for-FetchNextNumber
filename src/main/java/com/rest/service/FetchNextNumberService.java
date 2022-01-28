package com.rest.service;

import java.util.List;

import com.rest.entities.FetchNextNumber;

public interface FetchNextNumberService {

   public String fetchNextNumberByCategoryCode(long categoryCode);
   public void saveNextNumber(long nextNumber,long categoryCode);
   public long computeNextNumber(long oldValue);
}
