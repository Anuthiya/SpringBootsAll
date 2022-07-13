package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PenRepository extends JpaRepository <PenEntity,Integer> {
	
	@Query(value="select brand form pen", nativeQuery=true)
	public List<String> getAllBrand();
	
	@Query(value="select brand,price form pen", nativeQuery=true)
	public List<Object> findBrandPrice();
	
	@Query(value="select brand from pen", nativeQuery=true)
	public List<Character> getBLL();
	
	@Query(value="select price from pen", nativeQuery=true)
	public List<Integer> getMaxPrice();

}
