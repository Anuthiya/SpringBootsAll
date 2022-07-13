package com.example.demo;

public class Prime {
	public void prime(int num) {
		boolean flag=false;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Prime:"+num);
		}
		else {
			System.out.println("Not Prime:"+num);
		}
	}
	public void positive(int num1) {
		if(num1>0) {
			System.out.println("Positive:"+num1);
		}
		else if(num1<0) {
			System.out.println("Negative:"+num1);
		}
		else if(num1==0) {
			System.out.println("Nutral:"+num1);
		}
		else {
			System.out.println("None of the above");
		}
	}

}
