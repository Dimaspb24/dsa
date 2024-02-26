package queue;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/description/">23</a>
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * Example 2:
 * <p>
 * Input: lists = []
 * Output: []
 * Example 3:
 * <p>
 * Input: lists = [[]]
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 *
 *
 * https://github.com/TheAlgorithms/Java/blob/master/src/main/java/com/thealgorithms/datastructures/lists/Merge_K_SortedLinkedlist.java
 * https://github.com/gouthampradhan/leetcode/blob/master/src/main/java/linked_list/MergeKSortedLists.java
 * https://github.com/sherxon/AlgoDS/blob/master/src/problems/medium/MergekSortedLists.java
 * https://github.com/kdn251/interviews/blob/master/leetcode/linked-list/MergeKSortedLists.java
 */
public class MergeKSortedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        return null;
    }
}
