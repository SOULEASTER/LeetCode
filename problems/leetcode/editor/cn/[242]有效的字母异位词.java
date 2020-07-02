// 题目标题: 有效的字母异位词
// 题目标记: valid-anagram
// 题目编号: 242	
// 题目描述:
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        // 没考虑unicode
//        if (s.length() != t.length()) {
//            return false;
//        }
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1)；
//        }
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1)；
//        }
//        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//            if (!Objects.equals(value, map2.get(key))) {
//                return false;
//            }
//        }
//
//        return true;


//        if (s.length() != t.length()) {
//            return false;
//        }
//        int[] table = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            table[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            table.[t.charAt(i) - 'a']--;
//            if (table[t.charAt(i) - 'a'] < 0) {
//                return false;
//            }
//        }
//        return true;

        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
