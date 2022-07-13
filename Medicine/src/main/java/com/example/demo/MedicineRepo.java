package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepo extends JpaRepository <MedicineEntity, Integer> {

}
