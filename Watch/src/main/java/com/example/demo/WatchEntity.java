package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Watch")
public class WatchEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String brand;
	private int price;
	private boolean isWarrantyAvailable;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setIsWarrantyAvailable(boolean isWarrantyAvailable) {
		this.isWarrantyAvailable=isWarrantyAvailable;
	}
	public int getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsWarrantyAvailable() {
		return isWarrantyAvailable;
	}
	 
	
	

}
