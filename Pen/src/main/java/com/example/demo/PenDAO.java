package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PenDAO {
	@Autowired
	PenRepository pr;
	
	public String saveDetails(PenEntity pe) {
		pr.save(pe);
		return "saved";
	}
	public String saveAll(List<PenEntity> pe) {
		for(PenEntity i:pe) {
		pr.save(i);
		}
		return "saved all List Array";
	}
	public String deleteById(int id) {
		pr.deleteById(id);
		return "Deleted Successfull";
	}

	public String deleteAll() {
		pr.deleteAll();
		return "Deleted All Successfull";
	}
	
	public PenEntity findById(int id) {
		return pr.findById(id).get();
	}
	 
	public List<PenEntity> findAll() {
		return pr.findAll();
	}
	
	public String updateAll(PenEntity pe) {
		 pr.save(pe).getId();
		 return "Updated";
	}
	
	public List<String> getAllBrand() {
		return pr.getAllBrand();
	}
	
	public List<Object> findBrandPrice() {
		return pr.findBrandPrice();
	}

	public List<Character> getBLL() {
		return pr.getBLL();
	}
	
	public List<Integer> getMaxPrice() {
		return pr.getMaxPrice();
	
		
	}
	
	

}
