import java.util.Scanner;

public class Power{
	public static void main(String[] args){
		//VariablesStart
		
		// number of buildings, number of boxes
		int buildingNumber, electricalBoxes;
		// the end result
		double totalRevenue;
		
		// 125.00 charged per building
		double BUILDING_CHARGE;
		BUILDING_CHARGE = 125.00;
		
		// addition to compute total
		double buildingRevenue;
		double boxRevenue;
		
		// 51.00 charged for each box
		double ELECTRICAL_BOX_COST;
		ELECTRICAL_BOX_COST = 51.00;
		
		//VariablesEnd
		
		System.out.println("How many buildings?");
		Scanner keyboard = new Scanner(System.in);
		buildingNumber = keyboard.nextInt();
		
		System.out.println("How many electrical boxes?");
		electricalBoxes = keyboard.nextInt();
		
		// main computations
		buildingRevenue = buildingNumber * BUILDING_CHARGE;
		boxRevenue = electricalBoxes * ELECTRICAL_BOX_COST;
		totalRevenue = buildingRevenue + boxRevenue;
		
		System.out.println(totalRevenue);
		
		
		
				
		
		
		
	}
}