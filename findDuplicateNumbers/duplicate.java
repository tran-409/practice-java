package findDuplicateNumbers;

import java.util.HashSet;

class duplicate {
    
    public static void main(String [] args) {
    	
    	int [] arrayOfNumbers = {1,5,4,2,6,9,3};
    	
    	System.out.println(containsDuplicate(arrayOfNumbers));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupe = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(dupe.contains(nums[i])) return true;
            dupe.add(nums[i]);
        }
        return false;
    }
}