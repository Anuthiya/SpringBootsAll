package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WatchRepository extends JpaRepository <WatchEntity,Integer> {

	@Query(value="select * from watch where price=?", nativeQuery=true)
	
	public List<WatchEntity> getPriceDetail(int var);
	
	@Query(value="select * from watch where price<=? and price>=?", nativeQuery=true)
	
	public List<WatchEntity> getRange(int var1, int var2);

	@Query(value="select * from watch where brand like %:watchname%", nativeQuery=true)
	
	public WatchEntity getBrand(String watchname);
	
	@Query(value="select brand from watch", nativeQuery=true)
	
	public List<String> getAllBrand();
	
	@Query(value="select * from watch where is_warranty_available is true", nativeQuery=true)
	
	public List<WatchEntity> getWarranty();
	
	@Query(value="select brand,price from watch", nativeQuery=true)
	
	public List<Object> getBP();
	
    @Query(value="select brand from watch", nativeQuery=true)
	
	public List<String> getBrand();
	
    @Query(value="select price from watch", nativeQuery=true)
	
   	public WatchEntity getPrice();
    
   }
