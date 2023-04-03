import java.util.Scanner;

public class Example3 {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }

//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.


    public static void main(String[] args) {
        Example3 example3=new Example3();
        int[]nums={1,2,2};
        int res=example3.singleNumber(nums);
        System.out.println(res);
    }
}