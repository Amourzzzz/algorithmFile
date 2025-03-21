package leetcode.editor.cn;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 3767 👎 0

public class ClimbingStairs70{
	public static void main(String[] args) {
		Solution solution = new ClimbingStairs70().new Solution();
		System.out.println(solution.climbStairs(45));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
		/*
		// 递归 时间超时
        	if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);
		*/
		// 动态规划
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int pre1 = 1;
		int pre2 = 2;
		int cur = 0;
		for (int i = 3; i <= n; i++) {
			cur = pre1 + pre2;
			pre1 = pre2;
			pre2 = cur;
		}
		return cur;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
