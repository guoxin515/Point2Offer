package point2Offer;

/**
 * Created by GX on 2017/8/15.
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class _34_GetUglyNumber {
    public static void main(String args[]){
        GetUglyNumber_Solution(10);
    }
    public static int GetUglyNumber_Solution(int index) {
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            int num2 = 1;
            int num3 = 1;
            int num5 = 1;
            for (int j = 0; j < i; j++) {
                num2 = dp[j] * 2;
                if (num2 > dp[i-1]){
                    break;
                }
            }
            for (int j = 0; j < i; j++) {
                num3 = dp[j] * 3;
                if (num3 > dp[i-1]){
                    break;
                }
            }
            for (int j = 0; j < i; j++) {
                num5 = dp[j] * 5;
                if (num5 > dp[i-1]){
                    break;
                }
            }
            dp[i] = min(num2,num3,num5);
        }
        return dp[index-1];
    }

    private static int min(int num2, int num3, int num5) {
        int temp = num2;
        if(num3 < temp){
            temp = num3;
        }
        if(num5 < temp){
            temp = num5;
        }
        return temp;
    }


}
