// 题目标题: 字符串的排列
// 题目标记: permutation-in-string
// 题目编号: 567	
// 题目描述:
//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。 
//
// 换句话说，s1 的排列之一是 s2 的 子串 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s1 = "ab" s2 = "eidbaooo"
//输出：true
//解释：s2 包含 s1 的排列之一 ("ba").
// 
//
// 示例 2： 
//
// 
//输入：s1= "ab" s2 = "eidboaoo"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 10⁴ 
// s1 和 s2 仅包含小写字母 
// 
// Related Topics 哈希表 双指针 字符串 滑动窗口 👍 642 👎 0


// 题目代码:
package leetcode.editor.cn;

public class PermutationInString_567 {

    public static void main(String[] args) {
        Solution solution = new PermutationInString_567().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int length = s1.length();
            int[] count1 = new int[26];
            for (int i = 0; i < length; i++) {
                count1[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i + length <= s2.length(); i++) {
//            String substring = s2.substring(i, i + length);
                int[] count2 = new int[26];
                for (int j = 0; j < length; j++) {
                    count2[s2.charAt(i + j) - 'a']++;
                }
                if (match(count1, count2)) {
                    return true;
                }
            }
            return false;
        }

        private Boolean match(int[] count1, int[] count2) {
            for (int j = 0; j < 26; j++) {
                if (count1[j] != count2[j]) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}