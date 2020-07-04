// 题目标题: 字符串相乘
// 题目标记: multiply-strings
// 题目编号: 43	
// 题目描述:
//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。 
//
// 示例 1: 
//
// 输入: num1 = "2", num2 = "3"
//输出: "6" 
//
// 示例 2: 
//
// 输入: num1 = "123", num2 = "456"
//输出: "56088" 
//
// 说明： 
//
// 
// num1 和 num2 的长度小于110。 
// num1 和 num2 只包含数字 0-9。 
// num1 和 num2 均不以零开头，除非是数字 0 本身。 
// 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。 
// 
// Related Topics 数学 字符串 
// 👍 376 👎 0


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String result = "0";
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < num2.length() - 1 - i; j++){
                stringBuilder.append("0");
            }
            int carry = 0;
            int n2 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int mul = (n1 * n2 + carry) % 10;
                stringBuilder.append(mul);
                carry = (n1 * n2 + carry) / 10;
            }
            result = addString(result, stringBuilder.reverse().toString());
        }
        return result;
    }

    private String addString(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry != 0; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            stringBuilder.append(sum);
            carry = (x + y + carry) / 10;
        }
        return stringBuilder.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
