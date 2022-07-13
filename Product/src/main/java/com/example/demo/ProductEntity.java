package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")


public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	  private int id;
	  private int productId;
	  private String productName;
	  private String productManufacturingDate;
	  private String productExpiryYearl;
	  
	  
	  public void setId(int id) {
		  this.id=id;
	  }
	  public void setProductId(int productId) {
		  this.productId=productId;
	  }
	  public void setProductName(String productName) {
		  this.productName=productName;
	  }
	  public void setProductManufacturingDate(String productManufacturingDate) {
		  this.productManufacturingDate=productManufacturingDate;
	  }
	  public void setProductExpiryYearl(String productExpiryYearl) {
		  this.productExpiryYearl=productExpiryYearl;
	  }
	  
	  public int getId() {
		  return id;
	  }
	  public int getProductId() {
		  return productId;
	  }
	  public String getProductName() {
		  return productName;
	  }
	  public String getProductManufacturingDate() {
		  return productManufacturingDate;
	  }
	  public String getProductExpiryYearl() {
		  return productExpiryYearl;
	  }
	 
		

	}



