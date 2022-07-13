package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MediControl {
	

    @Autowired
    RestTemplate restTemp;
    
    String mediURL="http://localhost:8080/Details";
    String gstURL="http://localhost:8081/GetGst";

    
    
@GetMapping(value="/GetwithNetprice")
public List<MedicineEntity> getpercen() {
	ResponseEntity<List<MedicineEntity>> response = restTemp.exchange("http://localhost:8080/Details", HttpMethod.GET,null,new ParameterizedTypeReference<List<MedicineEntity>> () {});
	 List<MedicineEntity> res=response.getBody();
	 res.forEach(x-> {
		 int hsn=x.getMedicineHSN();
		 })
		 
	 }
     
    
    	 
  
