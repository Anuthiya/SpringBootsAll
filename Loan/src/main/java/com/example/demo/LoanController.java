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
public class LoanController {
	@Autowired
	LoanService ls;
	@PostMapping("/save")
	public String saveDetails(@RequestBody LoanEntity le) {
		return ls.saveDetails(le);
	}
    @GetMapping("/FindAll") 
    public List<LoanEntity>findAll() {
		return ls.findAll();
	}
    @GetMapping("/FindById/{id}")
    public LoanEntity findById(@PathVariable int id) {
    	return ls.findById(id);
    }
    @DeleteMapping("/DeleteById/{id}")
    public String deleteById (@PathVariable int id) {
    	return ls.deleteById(id);
    }
    @DeleteMapping("/DeleteAll") 
    public String deleteAll() {
    	return ls.deleteAll();
    }
    @PutMapping("/Update") 
    public String updateAll(@RequestBody LoanEntity le) {
    	return ls.updateAll(le);
    }
    @PostMapping("/saveAll")
	public String saveAll(@RequestBody List<LoanEntity> le) {
    	return ls.saveAll(le);
    }
    	
    }
    	
    	
    	
    

	


