package com.rest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FetchNextNumber
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String categoryCode;
    private Long value;
    
    public FetchNextNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FetchNextNumber categoryCode=" + categoryCode + ", value=" + value + "]";
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
