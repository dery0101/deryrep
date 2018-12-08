package Tollplaza;

public class TollData {
	int totalPrivateCount=0;
	int totalCommercialCount=0;
	float totalPrivateTax=0;
	float totalCommercialTax=0;
	float tempTax=0;
	float makeEntry(Vehicle v, String type, String highway) {
		if(type.equals("Private") && (highway.equals("National") || highway.equals("State") || highway.equals("Local"))){
			tempTax = v.calcTax(type, highway);
			totalPrivateCount+=1;
			totalPrivateTax = totalPrivateTax + tempTax;
			
	}
		else if(type.equals("Commercial") && (highway.equals("National") || highway.equals("State") || highway.equals("Local"))){
			tempTax = v.calcTax(type, highway);
			totalCommercialCount+=1;
			totalCommercialTax = totalCommercialTax + tempTax;
		}
		else{
			//throw new RoadException("Invalid Vehicle/Highway");
		}		
		
		tempTax=0;
		return 0;
}
	int getTotalCommercialCount()
	{
		return totalCommercialCount ;
	}
	
	int getTotalPrivateCount()
	{
		return totalPrivateCount ;
	}
	
	float getTotalCommercialTax()
	{
		return totalCommercialTax ;
	}
	
	float getTotalPrivateTax()
	{
		return totalPrivateTax ;
	}

	public static void main(String[] args) {
		try{
			PrivateVehicle pv = new PrivateVehicle("TS08CA1111");
			CommercialVehicle cv = new CommercialVehicle("TS09AB1111");
			TollData td = new TollData();
			td.makeEntry(pv,"Private", "National");
			td.makeEntry(cv,"Commercial", "Local");
			System.out.println("Total Private Vehicle Count is: " + td.getTotalPrivateCount());
			System.out.println("Total Tax for Private Vehicles is: " + td.getTotalPrivateTax());
			System.out.println("Total Commercial Vehicle Count is: " + td.getTotalCommercialCount());
			System.out.println("Total Tax for Commercial Vehicles is: " + td.getTotalCommercialTax());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	
