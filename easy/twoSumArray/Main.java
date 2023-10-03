package easy.twoSumArray;


import java.util.HashMap;
import java.util.Map;

//Problem:  The Two Sum problem asks us to find two numbers in an array that sum up to a given target value.
// We need to return the indices of these two numbers.
public class Main {
    public static void main(String[] args) {
        int[] intputArr = new int[]{3,1,3,4,3};
        int target = 6;
        int[] result = twoSum1(intputArr, target);
        for (Integer i : result) {
            System.out.println(i);
        }
    }



    //Two-pass Hash Table
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsHash.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (numsHash.containsKey(complement) && numsHash.get(complement)!=i){
                return new int[]{i,numsHash.get(complement)};
            }
        }
        return new int[]{};
    }

    //One-pass Hash Table
    public static int[] twoSum1(int[] nums, int target){
        Map<Integer,Integer> numsHash = new HashMap<>();
        for (int i = 0; i< nums.length;i++){
            int complement = target-nums[i];
            if (numsHash.containsKey(complement)){
                return new int[]{numsHash.get(complement),i};
            }
            numsHash.put(nums[i],i);
        }
        return new int[]{};
    }
}
