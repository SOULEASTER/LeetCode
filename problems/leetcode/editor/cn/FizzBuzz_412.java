// 题目标题: Fizz Buzz
// 题目标记: fizz-buzz
// 题目编号: 412	
// 题目描述:
//给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中： 
//
// 
// answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。 
// answer[i] == "Fizz" 如果 i 是 3 的倍数。 
// answer[i] == "Buzz" 如果 i 是 5 的倍数。 
// answer[i] == i （以字符串形式）如果上述条件全不满足。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["1","2","Fizz"]
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：["1","2","Fizz","4","Buzz"]
// 
//
// 示例 3： 
//
// 
//输入：n = 15
//输出：["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","1
//4","FizzBuzz"] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 10⁴ 
// 
// Related Topics 数学 字符串 模拟 👍 175 👎 0


// 题目代码:
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FizzBuzz_412 {

    public static void main(String[] args) {
        Solution solution = new FizzBuzz_412().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                String s = String.valueOf(i);
                String a = "";
                if (i % 3 == 0) {
                    a = "Fizz";
                }
                if (i % 5 == 0) {
                    if (!Objects.equals(a, "Fizz")) {
                        a = "Buzz";
                    } else {
                        a += "Buzz";
                    }
                }
                if (!Objects.equals(a, "")) {
                    s = a;
                }
                result.add(s);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}