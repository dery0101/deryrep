package Tollplaza;

abstract public class Vehicle {
	String regno;
	public Vehicle(String regno){
	this.regno=regno;	
	}
   public abstract float calcTax(String type,String highway);
}
