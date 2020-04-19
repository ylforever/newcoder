package com.elon.newcoder.service.sumn;

public class Solution {
    /**
     * 计算 1+2+3+...+n的值。
     *
     * @param n 最大值
     * @return 求和值
     */
    public int Sum_Solution(int n) {
        return recursionSum(n);
    }

    private int recursionSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + recursionSum(n - 1);
    }
}
