package owo;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int changeAmount = input.nextInt();
		
		int[] changeReturn = Return(changeAmount);
		//System.out.println(changeReturn[1]);
		System.out.println("I was given $." + changeReturn[0] + " in change. I split it up as " + changeReturn[1] +" quarters, " + changeReturn[2] + " dimes, " + changeReturn[3] + " nickles and " + changeReturn[4] + " pennies");
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
			newArray[0] = changeAmount;
			newArray[1] = quarterCount;
			newArray[2] = dimeCount;
			newArray[3] = nickleCount;
			newArray[4] = pennyCount;
			
			return newArray;
	}
}
