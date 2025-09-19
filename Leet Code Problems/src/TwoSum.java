import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem 1: Two Sum
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    
    /**
     * Solution using HashMap for O(n) time complexity
     * Time Complexity: O(n) - We traverse the list containing n elements only once
     * Space Complexity: O(n) - The extra space required depends on the number of items stored in the hash table
     * 
     * @param nums array of integers
     * @param target target sum
     * @return array containing indices of two numbers that add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store value and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that we need to find
            int complement = target - nums[i];
            
            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of complement and current number
                return new int[]{map.get(complement), i};
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // This should never be reached based on problem constraints
        throw new IllegalArgumentException("No two sum solution");
    }
    
    /**
     * Brute force solution - O(n²) time complexity
     * Time Complexity: O(n²) - For each element, we try to find its complement by looping through the rest of array
     * Space Complexity: O(1) - The space required does not depend on the size of the input array
     * 
     * @param nums array of integers
     * @param target target sum
     * @return array containing indices of two numbers that add up to target
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}