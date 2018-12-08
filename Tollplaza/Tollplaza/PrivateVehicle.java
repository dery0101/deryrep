package Tollplaza;

public class PrivateVehicle extends Vehicle {
	public PrivateVehicle(String regno) {
		super(regno);
	}
	float tempPrivateTax;
	  public float calcTax(String type,String highway) {
		  if(highway.equals("National")) {
			 return(tempPrivateTax=90);}
		  else if(highway.equals("state")) {
			  return(tempPrivateTax=60);}
		  else if(highway.equals("local")) {
			  return(tempPrivateTax=30);}
		  else {
			  System.out.println("invalid highway type");}
			  return(tempPrivateTax=0);
	  }
	

}
