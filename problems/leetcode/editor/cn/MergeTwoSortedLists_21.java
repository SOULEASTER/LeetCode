// 题目标题: 合并两个有序链表
// 题目标记: merge-two-sorted-lists
// 题目编号: 21	
// 题目描述:
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 👍 2357 👎 0


// 题目代码:
package leetcode.editor.cn;

public class MergeTwoSortedLists_21 {

    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists_21().new Solution();
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode p = list1;
            ListNode q = list2;
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
    }
//leetcode submit region end(Prohibit modification and deletion)

}