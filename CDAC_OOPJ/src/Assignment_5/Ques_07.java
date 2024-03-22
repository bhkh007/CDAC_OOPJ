package Assignment_5;

import java.util.Scanner;

class VehicleInfo
{
	private String vehicleType;
	private int numAxles;
	private double distanceInfo;
	

	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumAxles() {
		return numAxles;
	}
	public void setNumAxles(int numAxles) {
		this.numAxles = numAxles;
	}
	public double getDistanceInfo() {
		return distanceInfo;
	}
	public void setDistanceInfo(double distanceInfo) {
		this.distanceInfo = distanceInfo;
	}
	
}

class TollBooth
{
	private double travelledDist;
	private double tollCalculation;
	private double totaldueAmount;
	
	public double getTravelledDist() {
		return travelledDist;
	}
	public void setTravelledDist(double travelledDist) {
		this.travelledDist = travelledDist;
	}
	public double getTollCalculation() {
		return tollCalculation;
	}
	public void setTollCalculation(double tollCalculation) {
		this.tollCalculation = tollCalculation;
	}
	
	
	VehicleInfo vi= new VehicleInfo();
	Scanner sc = new Scanner(System.in);
	void showMenu(int n) {
		if (n==1) {
			System.out.println("Enter vehicle type {Car/Van/Bus/Truck}");
			String type = sc.nextLine();
			vi.setVehicleType(type);
		}
		else if(n==2) {
			System.out.println("Enter number of axles");
			int numAxles = sc.nextInt();
			vi.setNumAxles(numAxles);
		}else if(n==3) {
			System.out.println("Enter distance travelled ");
			double travelledDist = sc.nextDouble();
			vi.setDistanceInfo(travelledDist);
		}
		else if(n==4){
			calculateTotalFee();
		}else if (n==5) {
			generateBill();
		}
	}
	private void calculateTotalFee() {
		// TODO Auto-generated method stub
		double ans = 0;
		String vehicleType = vi.getVehicleType();
		vehicleType = vehicleType.toLowerCase();
		System.out.println(vi.getVehicleType());
		if(vehicleType.equals("car") || vehicleType.equals("van")
				|| vehicleType.equals("bus"))
		{
			ans = vi.getNumAxles()*0.25;
		}else if(vehicleType.equals("truck")) {
			ans = vi.getNumAxles()*0.5;
		}
		setTollCalculation(ans);
		System.out.println("Toll fee is "+ getTollCalculation());
		
	}
	private void generateBill() {
		// TODO Auto-generated method stub
		calculateTotalFee();
		System.out.println("1. Vehicle Type "+ vi.getVehicleType());
		System.out.println("2. Number of Axles "+ vi.getNumAxles());
		System.out.println("3. Distance travelled " + vi.getDistanceInfo());
		System.out.println("4. Toll Fee : " + getTollCalculation() +" ₹");
		System.out.println("Total amount due"+ (getTollCalculation()+2) + " ₹" );
	}
}

public class Ques_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TollBooth tbh = new TollBooth();
		
		while(true) {
			System.out.println("1. Enter vehicle type {Car/Van/Bus/Truck} : ");
			System.out.println("2. Enter number of axles : ");
			System.out.println("3. Enter distance travelled : ");
			System.out.println("4. Calculate bill = ");
			System.out.println("5. Generate bill ");
			System.out.println("6. Exit");
			int n = sc.nextInt();
					
			if(n==1) {
				tbh.showMenu(n);
			}else if(n==2) {
				tbh.showMenu(n);
			}
			else if(n==3) {
				tbh.showMenu(n);
			}
			else if(n==4) {
				tbh.showMenu(n);
			}
			else if(n==5) {
				tbh.showMenu(n);
			}else if(n==6) {
				break;
			}
		}
		System.out.println("Thankyou for Visiting!!");
	}

}
