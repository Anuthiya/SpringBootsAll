package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
	@Autowired
	MedicineDao md;
	public String saveDetails(MedicineEntity me) {
		 return md.saveDetails(me);
	}
	
	//public List<MedicineEntity> getAll() {
		//return md.getAll();
  // }	

	

}
