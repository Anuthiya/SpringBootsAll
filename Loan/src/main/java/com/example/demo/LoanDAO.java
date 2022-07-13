package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LoanDAO {
	@Autowired
	LoanRepository lr;
	
	public String saveDetails(LoanEntity le) {
		lr.save(le);
		return "saved";
	}
   
    public List<LoanEntity>findAll() {
		return lr.findAll();
	}
   
    public LoanEntity findById(int id) {
    	return lr.findById(id).get();
    }

    public String deleteById (int id) {
    	lr.deleteById(id);
    	return "deleted by id";
    }
 
    public String deleteAll() {
    	lr.deleteAll();
    	return "deleteAll";
    }
 
    public String updateAll(LoanEntity le) {
		 lr.save(le).getId();
		 return "Updated";

    }
	public String saveAll(List<LoanEntity> le) {
		for(LoanEntity i:le) {
			lr.save(i);
		}
		return "Saved all";
		}
	}
    	
	
	



