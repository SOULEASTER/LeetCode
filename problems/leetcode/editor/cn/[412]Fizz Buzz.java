// 题目标题: Fizz Buzz
// 题目标记: fizz-buzz
// 题目编号: 412	
// 题目描述:
//写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
//


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 题目代码:
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
