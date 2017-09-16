package point2Offer;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字
 * 及条件判断语句（A?B:C）。
 */
public class _46_Sum1_n {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (sum > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }
}
