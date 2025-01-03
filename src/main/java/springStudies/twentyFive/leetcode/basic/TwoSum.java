package springStudies.twentyFive.leetcode.basic;

import java.util.HashMap;

public class TwoSum {
    //constraints
    //1) 2 <= nums.length <= 10⁴:

    // The array nums will have at least 2 elements and at most 10,000 elements.
    // This implies that inefficient solutions, such as a brute force approach with O(n²) complexity, may become slow for inputs near the upper limit (10,000 elements).

    //2)-10⁹ <= nums[i] <= 10⁹:

    // Each element in the array can have values between -1 billion and 1 billion.
    // This ensures that the numbers are large but still fit within an integer data type (int).

    //3)-10⁹ <= target <= 10⁹:

    // The target value can also be large but is limited to ensure it is computable within the bounds of an integer.

    //4) only one answer -> we do not need to handle cases where multiple pairs of indices could be valid.time, space: O(n)

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //key and value
        //key -> value of array's current element
        //value -> indice of this element
        //example: [2,7,11,15] key 2 value 0
        //example: [2,7,11,15] key 7 value 1
        //map = {2: 0, 7: 1}
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //calculation of the target - current value
            if (map.containsKey(complement)) { //if there already is the element in the map, we already add it. search by key
                return new int[] {map.get(complement), i}; //here return the first number add on the map and the current
            }
            map.put(nums[i], i); //first iteration will pass here
            //result tagert 9:
            //after 1 iteration -> complement = 9-2 = 7
            //map.put(nums[i], i) = (2,0) map.get(2) = 0
            //2 iteration ->  complement = 9 - 7 = 2
            //map.containsKey(complement) = map.containsKey(2) = yes
            //return new int[] {map.get(complement), i}; = int[] {map.get(2), i} = int[] {0,1}
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
