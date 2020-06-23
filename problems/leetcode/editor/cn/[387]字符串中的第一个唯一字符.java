// 题目标题: 字符串中的第一个唯一字符
// 题目标记: first-unique-character-in-a-string
// 题目编号: 387	
// 题目描述:
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串


import java.util.HashMap;

// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c, i);
//        }
//        int result = Integer.MAX_VALUE;
//
//        if (map.size() == 1) {
//            for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//                Integer value = characterIntegerEntry.getValue();
//                if (value != 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//
//        } else {
//            for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//                Integer value = characterIntegerEntry.getValue();
//                if (value < result) {
//                    result = value;
//                }
//            }
//        }
//        return result != Integer.MAX_VALUE ? result : -1;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
