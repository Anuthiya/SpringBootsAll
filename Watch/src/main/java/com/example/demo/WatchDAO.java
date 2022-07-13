package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class WatchDAO {
	@Autowired
	WatchRepository wr;
	
	
	public String saveDetail(WatchEntity we) {
		wr.save(we);
		return "saved successfully";
	}
	
	public String deleteId(int id) {
		wr.deleteById(id);
		return "Delete successfully";
	}
	public List<WatchEntity> getAll() {
		return wr.findAll();
		
	}
	public WatchEntity getIdDetail(int id) {
		
		return wr.findById(id).get();
	}
	public String deleteAllDetail() {
		wr.deleteAll();
		return "Deleted";
	}
	public String updateAll(WatchEntity le) {
		 wr.save(le).getId();
		 return "Updated";

   }
	public String saveAll(List<WatchEntity> le) {
		for(WatchEntity i:le) {
			wr.save(i);
		}
		return "Saved all";
		}
	public List<WatchEntity> getPriceDetail(int var) {
		return wr.getPriceDetail(var);
		
	}
	public List<WatchEntity> getRange(int var1,int var2) {
		return wr.getRange(var1,var2);
	}
	public WatchEntity getBrand(String watchname) {
		return wr.getBrand(watchname);
	}
	public List<String> getAllBrand() {
		return wr.getAllBrand();
	}
	 public List<WatchEntity> getWarranty() {
	    	return wr.getWarranty();
	 }
	 public List<Object> getBP() {
		 return wr.getBP();
	 }
	 public WatchEntity findGst(int id) {
		 return wr.findById(id).get();
	 }
	 public List<WatchEntity> findAll() {
		 return wr.findAll();
	 }
	 public WatchEntity findVow(int id) {
		 return wr.findById(id).get();
	 }
//	 public List<String> getBrand() {
//		 return wr.getBrand();
//	 }
//	 public WatchEntity getPrice() {
//	    	return wr.getPrice();
//     }
//	 
}
