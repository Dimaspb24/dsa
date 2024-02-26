package geom;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/largest-perimeter-triangle/description/">976</a>
 * <p>
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,1,2]
 * Output: 5
 * Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,10]
 * Output: 0
 * Explanation:
 * You cannot use the side lengths 1, 1, and 2 to form a triangle.
 * You cannot use the side lengths 1, 1, and 10 to form a triangle.
 * You cannot use the side lengths 1, 2, and 10 to form a triangle.
 * As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 104
 * 1 <= nums[i] <= 106
 */
public class LargestPerimeterTriangle {

    // Сумма двух любых сторон треугольника должна быть больше третьей
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) return nums[i] + nums[i + 1] + nums[i + 2];
        }

        return 0;
    }
}
