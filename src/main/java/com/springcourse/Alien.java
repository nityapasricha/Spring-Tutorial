package com.springcourse;

public class Alien {
	 int age;
	 private Laptop lap;
	
	
    public Alien() {
		 System.out.println("Alien object created");
	}

	public Alien(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public void code(){
        System.out.println("coding..");
    }
    
}
