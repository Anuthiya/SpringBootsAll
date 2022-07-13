package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineControl {
	@Autowired
	MedicineService ms;
	
	@PostMapping("/Save")
	public String saveDetails(@RequestBody MedicineEntity me) {
		return ms.saveDetails(me);
	}
	
    //@GetMapping("/getDetails") 
//	public List<MedicineEntity> getAll() {
	//return ms.getAll();
    //}	

}
