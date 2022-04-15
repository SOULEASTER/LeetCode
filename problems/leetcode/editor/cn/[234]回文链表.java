// 题目标题: 回文链表
// 题目标记: palindrome-linked-list
// 题目编号: 234	
// 题目描述:
//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }

    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        ListNode q = null;
        while (p != null) {
            ListNode listNode = p.next;
            p.next = q;
            q = p;
            p = listNode;
        }

        p = head;
        while (p.next != null && q.next != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        if (p.next != null || q.next != null) {
            return false;
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
