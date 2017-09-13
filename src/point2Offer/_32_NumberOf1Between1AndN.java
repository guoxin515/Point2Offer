package point2Offer;

/**
 * Created by GX on 2017/8/14.
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 */
public class _32_NumberOf1Between1AndN {
    public static void main(String args[]) {
        int n = 10000;
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += numberCount(i);
        }
        return count;
    }

    public static int numberCount(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
