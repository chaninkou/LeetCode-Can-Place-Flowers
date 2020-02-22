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
				
				// update count
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
	
	// A longer solution I made, but it's still o(n) time
    public boolean canPlaceFlowers2(int[] flowerbed, int n) {    
        int len = flowerbed.length;
        
        // Checking edge cases, ex: [0], [1], [0,1]
        if(len <= 2){
            if(flowerbed[0] == 0 && len == 1 || flowerbed[0] == 0 && flowerbed[1] != 1){
               n--; 
            }
            return n <= 0;
        }

        // [0,0]
        if (flowerbed[0] == 0 && flowerbed[1] == 0){
                flowerbed[0] = 1;
                n--;
        }     
        
        // [1,0,0]
        if (flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0){
                flowerbed[len - 1] = 1;
                n--;
        }  
        
        // [1,0,0,0,1]
        for(int i = 1; i < flowerbed.length; i++){
            if(flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && i != 1){
                flowerbed[i] = 1;
                n--;
            }           
        }
        
        return n <= 0;
    }
}
