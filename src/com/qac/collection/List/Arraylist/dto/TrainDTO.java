package com.qac.collection.List.Arraylist.dto;

public class TrainDTO {
	private String name ;
	private String origin;
	private String destination;
	private int speed;
	
	public TrainDTO() {
		System.out.println("Invoking "+ this.getClass().getSimpleName()+" constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String toString() {
		return "[Name : "+ name+"\tOrigin : "+ origin +"\tDestination : "+ destination +"\tSpeed :" + speed +" ]";
		
	}
}
