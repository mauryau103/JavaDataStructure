package leetcode.easy;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	
        int intArray[];    //declaring array
        intArray = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                     
                     intArray[0]=i;
                     intArray[1]=j;
                
            }
            }
           
        }
        return intArray;
    }
}

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] myarr = new int[] {1,2,3,4,5};
		
		Solution solu = new Solution();
		
		int[] returnedArray = solu.twoSum(myarr, 3);
		
		for(int i = 0;i<returnedArray.length;i++) {
			System.out.println(returnedArray[i]);
		}
		
	}

}
