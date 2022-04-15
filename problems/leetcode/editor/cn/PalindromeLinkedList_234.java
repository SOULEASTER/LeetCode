// 题目标题: 回文链表
// 题目标记: palindrome-linked-list
// 题目编号: 234	
// 题目描述:
//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 👍 1345 👎 0


// 题目代码:
package leetcode.editor.cn;

public class PalindromeLinkedList_234 {

    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList_234().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
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

}