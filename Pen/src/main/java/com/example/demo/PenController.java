package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenController {
	
    @Autowired
    PenService ps;

@PostMapping("/Save")
public String saveDetails(@RequestBody PenEntity pe) {
	return ps.saveDetails(pe);
}
@PostMapping("/SaveAll") 
public String saveAll(@RequestBody List<PenEntity> pe) {
	return ps.saveAll(pe);
}
@DeleteMapping("/DeleteById/{id}")
public String deleteById(@PathVariable int id) {
	return ps.deleteById(id);
}
@DeleteMapping("/DeleteAll") 
public String deleteAll() {
	return ps.deleteAll();
}
@GetMapping("/findById/{id}")
public PenEntity findById(@PathVariable int id) {
	return ps.findById(id);
}
@GetMapping("/findAll") 
public List<PenEntity> findAll() {
	return ps.findAll();
}
@PutMapping("/UpdateAll")
public String updateAll(@RequestBody PenEntity pe) {
	return ps.updateAll(pe);
}
@GetMapping("/GetAllBrand")
public List<String> getAllBrand() {
	return ps.getAllBrand();
}
@GetMapping("/findBrandPrice")
public List<Object> findBrandPrice() {
	return ps.findBrandPrice();
}
@GetMapping("/GetBrandLastLetter") 
public List<Character> getBLL() {
	return ps.getBLL();
}
@GetMapping("/GetMaxPrice")
public List<Integer> getMaxPrice() {
	return ps.getMaxPrice();
}
}


	
	
	
