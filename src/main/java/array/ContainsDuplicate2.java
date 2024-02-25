package array;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">219</a>
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 */
public class ContainsDuplicate2 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3) ? "\n---Excellent---\n" : "\n---Wrong solution---\n");
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(i) <= k)) return true;
            map.put(nums[i], i);
        }

        return false;
    }
}
