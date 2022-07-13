package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface GstRepo extends JpaRepository <GstEntity, Integer> {
	
	@Query(value="select percentage from gst where hsn=:hsn", nativeQuery=true)
	
	public int getByHsn(@PathVariable ("hsn") int hsn);

}
