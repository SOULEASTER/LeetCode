// 题目标题: 字符串的排列
// 题目标记: permutation-in-string
// 题目编号: 567	
// 题目描述:
//给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。 
//
// 换句话说，第一个字符串的排列之一是第二个字符串的子串。 
//
// 示例1: 
//
// 
//输入: s1 = "ab" s2 = "eidbaooo"
//输出: True
//解释: s2 包含 s1 的排列之一 ("ba").
// 
//
// 
//
// 示例2: 
//
// 
//输入: s1= "ab" s2 = "eidboaoo"
//输出: False
// 
//
// 
//
// 注意： 
//
// 
// 输入的字符串只包含小写字母 
// 两个字符串的长度都在 [1, 10,000] 之间 
// 
// Related Topics 双指针 Sliding Window 
// 👍 146 👎 0


// 题目代码:
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
