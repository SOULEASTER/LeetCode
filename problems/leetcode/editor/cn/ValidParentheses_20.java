// 题目标题: 有效的括号
// 题目标记: valid-parentheses
// 题目编号: 20	
// 题目描述:
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 👍 3177 👎 0


// 题目代码:
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses_20 {

    public static void main(String[] args) {
        Solution solution = new ValidParentheses_20().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');

            Stack<Character> chars = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (chars.isEmpty()) {
                    chars.push(c);
                } else {
                    if (!map.containsKey(c)) {
                        chars.add(c);
                    } else {
                        Character character = map.get(c);
                        if (Objects.equals(chars.get(chars.size() - 1), character)) {
                            chars.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            return chars.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}