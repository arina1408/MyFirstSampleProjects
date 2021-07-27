package com.ankit.myproject;

//Immutable Class
class Engine{
	int speed;

	public Engine(int speed) {
		this.speed = speed;
	}
	
	
}
public final class Sample

{
	
	private final int id;
	private final String name;
	private final Engine engine;
	
	
	
	public Sample(int id, String name, Engine e) {
		this.id = id;
		this.name = name; 
		Engine newEngine = new Engine(e.speed);
		this.engine = newEngine;

	}
	
	
	public int getId() {
		return id;
	}
	public Engine getEngine() {
		 return new Engine(this.engine.speed);
	}


	public String getName() {
		return name;
	}
	
	
	public static void main(String []args)
	{   
		Engine e = new Engine(50);
		Sample s= new Sample(1,"ankit",e);
		System.out.println(s.engine.speed);
		e.speed=70;
		System.out.println(s.engine.speed);
		
	}
	
	
	}


