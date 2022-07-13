package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PenService {
	@Autowired
	PenDAO pd;
	
	public String saveDetails(PenEntity pe) {
		return pd.saveDetails(pe);
	}
	public String saveAll(List<PenEntity> pe) {
		return pd.saveAll(pe);
	}
	public String deleteById(int id) {
		return pd.deleteById(id);
	}

	public String deleteAll() {
		return pd.deleteAll();
	}
	
	public PenEntity findById(int id) {
		return pd.findById(id);
	}
	 
	public List<PenEntity> findAll() {
		return pd.findAll();
	}
	
	public String updateAll(PenEntity pe) {
		return pd.updateAll(pe);
	}
	
	public List<String> getAllBrand() {
		return pd.getAllBrand();
	}
	
	public List<Object> findBrandPrice() {
		return pd.findBrandPrice();
	}
	
	
}
	 
	 
	 
	 
    
//	public List<Character> getBLL() {
//		List<String> p = pd.getBLL();
//		List<Character> s=new ArrayList<>();
//		for(PenEntity i:p) {
//		return i.getBrand().charAt(i.getBrand()-length-1);
//	}
//	}
//	
//	public List<Integer> getMaxPrice() {
//		return pd.getMaxPrice();
//	
//	}
//}
