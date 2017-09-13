package point2Offer;

/**
 * Created by GX on 2017/8/29.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class _40_FindNumsAppearOnce {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length < 2)
            return;
        int myxor = 0;
        int flag = 1;
        for (int i = 0; i < array.length; ++i)
            myxor ^= array[i];

        while ((myxor & flag) == 0)
            flag <<= 1;

        for (int i = 0; i < array.length; ++i) {
            if ((flag & array[i]) == 0)
                num2[0] ^= array[i];
            else
                num1[0] ^= array[i];
        }
    }


}
