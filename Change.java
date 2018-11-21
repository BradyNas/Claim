package owo;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How much change do you have?(In numbers only)");
		int changeAmount = input.nextInt();
		
		int[] changeReturn = Return(changeAmount);
		System.out.println("I was given $." + changeAmount + " in change. I split it up as " + changeReturn[0] +" quarters, " + changeReturn[1] + " dimes, " + changeReturn[2] + " nickles and " + changeReturn[3] + " pennies");
	}
		public static int[] Return(int changeAmount) {
			int change = changeAmount;
			int quarterCount = 0;
			int dimeCount = 0;
			int nickleCount = 0;
			int pennyCount = 0;
			while(change > 0 ){
				while(change >= 25){
					change = change - 25;
					quarterCount = quarterCount + 1;
			}
				while(change >= 10){
					change = change - 10;
					dimeCount = dimeCount + 1;
			}
				while(change >= 5){
					change = change - 5;
					nickleCount = nickleCount + 1;
			}
				while(change >= 1){
					change = change - 1;
					pennyCount = pennyCount + 1;
			}
		}
			int[] newArray = new int[5];
			newArray[0] = quarterCount;
			newArray[1] = dimeCount;
			newArray[2] = nickleCount;
			newArray[3] = pennyCount;
			
			return newArray;
	}
}
