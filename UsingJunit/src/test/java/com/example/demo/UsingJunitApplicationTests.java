package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsingJunitApplicationTests {

	@Test
	void contextLoads() {
		
		System.out.println("HELLO");
	}
	
	//public class TestPrime 
		   Prime p=new Prime();
			@Test
			public void prime() {
				p.prime(11);
			}
			@Test
			public void positive() {
			p.positive(0);
		}
}


