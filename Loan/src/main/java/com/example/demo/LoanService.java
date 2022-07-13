package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoanService {
	@Autowired
	LoanDAO ld;
	
	public String saveDetails(LoanEntity le) {
		return ld.saveDetails(le);
	}
   
    public List<LoanEntity>findAll() {
		return ld.findAll();
	}
   
    public LoanEntity findById(int id) {
    	return ld.findById(id);
    }

    public String deleteById (int id) {
    	return ld.deleteById(id);
    }
 
    public String deleteAll() {
    	return ld.deleteAll();
    }
 
    public String updateAll(LoanEntity le) {
    	return ld.updateAll(le);
    }
    public String saveAll(List<LoanEntity> le) {
		return ld.saveAll(le);	
    }	
    	
    

	


}
