package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")

public class CustomerEntity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

  private int id;
  private int customerId;
  private String customerName;
  private String customerGender;
  private String shippingAddress;
  private String deliveryAddress;
  
  public void setId(int id) {
	  this.id=id;
  }
  public void setCustomerId(int customerId) {
	  this.customerId=customerId;
  }
  public void setCustomerName(String customerName) {
	  this.customerName=customerName;
  }
  public void setCustomerGender(String customerGender) {
	  this.customerGender=customerGender;
  }
  public void setShippingAddress(String shippingAddress) {
	  this.shippingAddress=shippingAddress;
  }
  public void setDeliveryAddress(String deliveryAddress) {
	  this.deliveryAddress=deliveryAddress;
  }
  public int getId() {
	  return id;
  }
  public int getCustomerId() {
	  return customerId;
  }
  public String getCustomerName() {
	  return customerName;
  }
  public String getCustomerGender() {
	  return customerGender;
  }
  public String getShippingAddress() {
	  return shippingAddress;
  }
  public String getDeliveryAddress() {
	  return deliveryAddress;
  
  }
	

}
