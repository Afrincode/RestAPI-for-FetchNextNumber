package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entities.FetchNextNumber;

@Repository
public interface FetchNextNumberRepository extends JpaRepository<FetchNextNumber, Long>{

}
