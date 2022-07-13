package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pen")
public class PenEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private String brand;
private int price;
private String color;
private boolean isRefillable;

public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setColor(String color) {
	this.color=color;
}
public String getColor() {
	return color;
}
public void setIsRefillable(boolean isRefillable) {
	this.isRefillable=isRefillable;
}
public boolean getIsRefillable() {
	return isRefillable;

}


}
