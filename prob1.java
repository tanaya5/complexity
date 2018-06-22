//check the sum of 2 nums in array to given target
//input and output:nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;  

class Solutions
{
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
	return new int[] {-1,-1};
		//throw new IllegalArgumentException("No two sum solution");
	}
}
class MainRun
{
	public static void main(String arg[])
	{
		 Scanner sc=new Scanner(System.in);  
		 System.out.println("add the target value");
		 String targets=sc.nextLine();
		 System.out.println("add inputs separated by space");
		 String input=sc.nextLine();
		  int target=Integer.parseInt(targets);
		  String[] items = input.trim().split("\\s+");
		  
		  int[] arr=new int[items.length];
		 for (int i=0;i<arr.length;i++)
		 {
			 arr[i]=Integer.parseInt(items[i]);
			 //System.out.println(arr[i]);
		 }
		
		 
		 int[] result=Solutions.twoSum(arr,target);
		 System.out.print("[");
		 for(int i=0;i<result.length;i++)
			 System.out.print(result[i]+ ",");
		  System.out.println("]");
		  
		   
	}
}
