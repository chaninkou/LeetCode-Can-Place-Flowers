package canPlaceFlower;

public class CheckIfNFlowerCanBePlaceFunction {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(n < 0 || n > flowerbed.length){
			return false;
		}
		
		// 1 because what if the 0 is on the most left of the array
		int count = 1;
		
		int openSpot = 0;
		
		for(int i = 0; i < flowerbed.length; i++){
			// If current element is 0, just increase the count
			if(flowerbed[i] == 0){
				count++;
			} else { // If its 1, check for open spot with the equation, reset count
				// Only if there is count of 3 or more to able to plant a flower
				openSpot += (count - 1)/2;
				
				count = 0;
			}
		}
		
		// In case its [0,1,0,0] at the end, you could plant a flower at the last element
		if(count != 0){
			openSpot += count / 2;
		}
		
		// return true if you could at least plant n amount of flower 
		return openSpot >= n;
	}
}
