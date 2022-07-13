package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class WatchService {
	@Autowired
	WatchDAO wd;
	
	
	public String saveDetail(WatchEntity we) {
		return wd.saveDetail(we);
	}
	public String deleteId(int id) {
		return wd.deleteId(id);
	}
	public List<WatchEntity> getAll() {
		return wd.getAll();
	}
	public WatchEntity getIdDetail(int id) {
		return wd.getIdDetail(id);
	}
	public String deleteAllDetail() {
		return wd.deleteAllDetail();
	}
	public String updateAll(WatchEntity le) {
    	return wd.updateAll(le);
    }
    public String saveAll(List<WatchEntity> le) {
		return wd.saveAll(le);	
    }
    public List<WatchEntity> getPriceDetail(int var) {
    	return wd.getPriceDetail(var);
    }
    public List<WatchEntity> getRange(int var1, int var2) {
    	return wd.getRange(var1, var2);
    
    }
    public WatchEntity getBrand(String watchname) {
    	return wd.getBrand(watchname);
    }
    public List<String> getAllBrand() {
    	return wd.getAllBrand();
    	
    }
    public List<WatchEntity> getWarranty() {
    	return wd.getWarranty();
    }
    public List<Object> getBP() {
    	return wd.getBP();
    	
    }
    public int findGst(int id) {
    	WatchEntity w=wd.findGst(id);
    	int gstPrice=0;
    	if(w.getIsWarrantyAvailable()==true) {
    		gstPrice=w.getPrice()+((w.getPrice()*10)/100);
    	return gstPrice;
    	}
    	else {
    		return w.getPrice();
    	}
    }
//    public List<WatchEntity> findAll() {
//    	return wd.findAll();
    public List<String> findAll() {
    	List<WatchEntity> w=wd.findAll();
    	List<String> s=new ArrayList<>();
    	for(WatchEntity i:w) {
    		if(i.getBrand().contains("a")) {
    			s.add(i.getBrand());
    		}
    	}
    		return s;
    	}
    public String findVow(int id) {
    	WatchEntity v=wd.findVow(id);
    
    		if(v.getBrand().contains("a")||v.getBrand().contains("e")||v.getBrand().contains("i")||v.getBrand().contains("o")||v.getBrand().contains("u")) {
    			return "Contains vowels";
    		}
    		else {
    			return "Not Contains Vowels";
    			
    		}
    	}
    
    
//    
//    Character a=' ';
//    public Character getBrand() {
//    	List<String> b= wd.getBrand();
//    	List<WatchEntity> w=new ArrayList<>();
//        for(WatchEntity i:b)
//        	
//        	a = b.getBrand().charAt(b.getBrand().length()-1);
//        }
//           return a;
//    }
//    int max=0;
//    public int getPrice() {
//    	WatchEntity p= wd.getPrice();
//    	//List<Integer> l=new ArrayList<>();
//    	//for(WatchEntity i:p) {
//    		if(max<p.getPrice()) {
//    			max=p.getPrice();
//    			//l.add(i.getPrice());
//    		}
//    	//}
//    	return max;
//    
//}
    

}

    



