package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GstControl {
	@Autowired
	GstRepo gr;
	
	@PostMapping("/Save")
	public String saveDetails(@RequestBody GstEntity ge) {
		 gr.save(ge);
		 return "Saved";
	}
	
    @GetMapping("/GetGst") 
	public List<GstEntity> getAll() {
		return gr.findAll();
    }	
    
    @GetMapping(value="getByHsn/{hsn}")
    public int getByHsn(@PathVariable ("hsn") int hsn) {
    	return gr.getByHsn(hsn);
    }



}
