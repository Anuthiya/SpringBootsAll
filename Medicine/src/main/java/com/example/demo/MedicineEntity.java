package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class MedicineEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

   private int id;
   private int medicineId;
   private String medicineName;
   private int medicineHSN;
   private int medicinePrice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMedicineId() {
	return medicineId;
}
public void setMedicineId(int medicineId) {
	this.medicineId = medicineId;
}
public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public int getMedicineHSN() {
	return medicineHSN;
}
public void setMedicineHSN(int medicineHSN) {
	this.medicineHSN = medicineHSN;
}
public int getMedicinePrice() {
	return medicinePrice;
}
public void setMedicinePrice(int medicinePrice) {
	this.medicinePrice = medicinePrice;
}
   
   

}
