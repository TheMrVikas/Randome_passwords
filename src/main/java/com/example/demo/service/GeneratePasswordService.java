package com.example.demo.service;

public interface GeneratePasswordService {
	public Integer getPasswordAsInteger(int number);
	
	public String getPasswordAsString(int number);
	
	public String getPasswordAsHexaDecimal(int num);
}
