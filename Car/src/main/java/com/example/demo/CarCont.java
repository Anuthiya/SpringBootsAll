package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CarCont {
	
	@Autowired
	CarRepo cr;
	
	@PostMapping("/Save")
	public String saveDetail(@RequestBody CarEntity ce) {
		cr.save(ce);
		return "Saved Successfully";
	}
	
	@PostMapping("/SaveAll")
	public String saveAll(@RequestBody List<CarEntity> ce) {
		for(CarEntity i:ce) {
            cr.save(i);
		}
		return "saved successfully";
	}

}
