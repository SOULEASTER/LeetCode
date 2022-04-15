// 题目标题: 字符串中的第一个唯一字符
// 题目标记: first-unique-character-in-a-string
// 题目编号: 387	
// 题目描述:
//给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: 0
// 
//
// 示例 2: 
//
// 
//输入: s = "loveleetcode"
//输出: 2
// 
//
// 示例 3: 
//
// 
//输入: s = "aabb"
//输出: -1
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含小写字母 
// 
// Related Topics 队列 哈希表 字符串 计数 👍 539 👎 0


// 题目代码:
package leetcode.editor.cn;

import java.util.HashMap;

public class FirstUniqueCharacterInAString_387 {

    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString_387().new Solution();
    }

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

}