package canPlaceFlower;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,1};
		
		int n = 1;
		
		System.out.println("Flowerbeds: " + Arrays.toString(flowerbed));
		
		System.out.println("Amount of flower: " + n );
		
		CheckIfNFlowerCanBePlaceFunction solution = new CheckIfNFlowerCanBePlaceFunction();
		
		System.out.println("Solution: " + solution.canPlaceFlowers(flowerbed, n));
	}
}
