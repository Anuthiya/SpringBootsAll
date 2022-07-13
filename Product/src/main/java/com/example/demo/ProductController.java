package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	@Autowired
	ProductRepo pr;
	
	@Autowired
	RestTemplate restTemp;
	
	@GetMapping(value="/chennaiship")
	public List<CustomerEntity> getChennaiShip() {
		ResponseEntity<List<CustomerEntity>> response = restTemp.exchange("http://localhost:8080/Details", HttpMethod.GET,null,new ParameterizedTypeReference<List<CustomerEntity>> () {});
	    List<CustomerEntity> customer=response.getBody();
	    return customer.stream().filter(x->x.getShippingAddress().equals("chennai")).collect(Collectors.toList());
	}
	
	@PostMapping("/Save")
	public String saveDetails(@RequestBody ProductEntity pe) {
		 pr.save(pe);
		 return "Saved";
	}
	
    @GetMapping("/Details") 
	public List<ProductEntity> getAll() {
		return getAll();
	
    }
    
    
}
