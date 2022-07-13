package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MedicineDao {
	@Autowired
	MedicineRepo mr;
	public String saveDetails(MedicineEntity me) {
		 mr.save(me);
		 return "Saved";
	}
	
   
	//public List<MedicineEntity> getAll() {
		//return mr.findAll();
   //}	


}
