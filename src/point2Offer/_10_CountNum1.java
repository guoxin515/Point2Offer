package point2Offer;

/**
 * Created by GX on 2017/8/6.
 * 输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 */
public class _10_CountNum1 {
    public static void main(String args[]){
        System.out.println(NumberOf1(8));
    }
    public static int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        int length = Integer.toBinaryString(n).length();
        while (length > 0){
            if((n & flag) != 0){
                count++;
            }
            length--;
            flag = flag << 1;
        }
        return count;
    }
}
