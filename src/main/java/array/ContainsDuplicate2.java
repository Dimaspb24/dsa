package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">219</a>
 * <p>
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * <p>
 * Constraints:
 * <p>
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
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(i) <= k)) return true;
            map.put(nums[i], i);
        }

        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {

        // ситуация когда К большое и получается одно большое окно
        if (k >= nums.length - 1) {
            HashSet<Integer> fullWindow = new HashSet<>(IntStream.of(nums).boxed().toList());
            return fullWindow.size() == nums.length;
        }

        // инициализация окна
        HashSet<Integer> window = new HashSet<>();
        int right = 0;
        while (right <= k) {
            window.add(nums[right++]);
        }
        // проверка условия в начальном окне
        if (window.size() <= k) {
            return true;
        }

        // скользящее окно
        while (right < nums.length) {
            window.remove(nums[right - k - 1]);
            window.add(nums[right++]);
            // проверка условия в скользящем окне
            if (window.size() <= k) {
                return true;
            }
        }

        return false;
    }
}
