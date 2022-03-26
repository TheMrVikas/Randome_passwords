package com.example.demo.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.service.GeneratePasswordService;
@Service
public class GeneratePasswordServiceImpl implements GeneratePasswordService {

	@Override
	public Integer getPasswordAsInteger(int number) {
		Integer nextInt = null;
		int tempNumber=0;
		while(number>0) {
		Random tempNum=new Random();
		nextInt = tempNum.nextInt()+1;
		nextInt=tempNumber*10+nextInt;
		number--;
		}
		System.err.println(nextInt);
		return nextInt;
	}

	@Override
	public String getPasswordAsString(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPasswordAsHexaDecimal(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
