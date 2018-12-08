package Tollplaza;

public class CommercialVehicle extends Vehicle {
	public CommercialVehicle(String regno) {
		super(regno);
	}
	  public float calcTax(String type,String highway) {
		  float i;
		  if(highway.equals("national")) {
			 return(i=150);}
		  else if(highway.equals("state")) {
			  return(i=100);}
		  else if(highway.equals("local")) {
			  return(i=50);}
		  else {
			  System.out.println("invalid higway type");}
			  return(i=0)
					  ;
			  
			  
			
	  }
	

}

