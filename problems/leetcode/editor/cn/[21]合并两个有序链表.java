// 题目标题: 合并两个有序链表
// 题目标记: merge-two-sorted-lists
// 题目编号: 21	
// 题目描述:
//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (p != null || q != null) {
            if (p == null) {
                cur.next = new ListNode(q.val);
                cur = cur.next;
                q = q.next;
                continue;
            }
            if (q == null) {
                cur.next = new ListNode(p.val);
                cur = cur.next;
                p = p.next;
                continue;
            }
            if (p.val < q.val) {
                cur.next = new ListNode(p.val);
                cur = cur.next;
                p = p.next;
            } else {
                cur.next = new ListNode(q.val);
                cur = cur.next;
                q = q.next;
            }
        }
        return result.next;
    }

//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) { val = x; }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
