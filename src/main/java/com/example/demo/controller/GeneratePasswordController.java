package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GeneratePasswordService;

@RestController
@RequestMapping("/password")
public class GeneratePasswordController {
	
	@Autowired
	private GeneratePasswordService passwordGeneratorService;
	
	@GetMapping(value = {"/getPazzword/{num}"})
	public Integer getPasswordAsInteger(@PathVariable("num")int num) {
		return passwordGeneratorService.getPasswordAsInteger(num);
	}
	
	@GetMapping("/")
	public String getApplicationMsg() {
		return "Hii.. This is password Generator Application";
	}

}
