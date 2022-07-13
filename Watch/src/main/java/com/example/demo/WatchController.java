package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WatchController {
	@Autowired
	WatchService ws;
	
	
	@PostMapping("/Save")
	public String saveDetail(@RequestBody WatchEntity we) {
		return ws.saveDetail(we);
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteId(@PathVariable int id) {
		return ws.deleteId(id);
	}
	
	@GetMapping("/Details") 
	
	public List<WatchEntity>getAll() {
		return ws.getAll();
	
	}
	
	@GetMapping("/View1/{id}") 
	public WatchEntity getIdDetail (@PathVariable int id) {
		return ws.getIdDetail(id);
		
	}
	@DeleteMapping("/DeleteAll") 
	public String deleteAllDetail() {
		return ws.deleteAllDetail();
	}
	@PutMapping("/UpdateAll") 
    public String updateAll(@RequestBody WatchEntity le) {
    	return ws.updateAll(le);
    }
    @PostMapping("/saveAll")
	public String saveAll(@RequestBody List<WatchEntity> le) {
    	return ws.saveAll(le);
    }
    @GetMapping("/getPDCustom/{var}")
    public List<WatchEntity> getPriceDetail(@PathVariable int var) {
    	return ws.getPriceDetail(var);
    	
    }
    @GetMapping("/getRange/{var1}/{var2}")
    public List<WatchEntity> getRange(@PathVariable int var1,@PathVariable int var2) {
         return ws.getRange(var1,var2);
    	
    }
    @GetMapping("/getModel/{watchname}")
    public WatchEntity getBrand(@PathVariable String watchname) {
    	return ws.getBrand(watchname);
    }
    @GetMapping("/getAllBrands")
    public List<String> getAllBrand() {
    	return ws.getAllBrand();
    
    }
    @GetMapping("/getWarranty")
    public List<WatchEntity> getWarranty() {
    	return ws.getWarranty();
    	
    }
    @GetMapping("/getBrandPrice")
    public List<Object> getBP() {
    	return ws.getBP();
    }
    @GetMapping("/gstPrice/{id}")
    public int findGst(@PathVariable int id) {
    	return ws.findGst(id);
    }
    @GetMapping("/FindAll")
    public List<String> findAll() {
    	return ws.findAll();
    }
    @GetMapping("/findVow/{id}")
    public String findVow(@PathVariable int id) {
    	return ws.findVow(id); 
    }
//    @GetMapping("/GetBrand")
//    public Character getBrand() {
//    	return ws.getBrand();
//    }
//    @GetMapping("/GetPrice")
//    public List<Integer> getPrice() {
//    	return ws.getPrice();
//    }
    		
    
    
}

	

	
	
	
	


