package point2Offer;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by GX on 2017/8/7.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _14_MakeOddBeforeEven {
    public void reOrderArray(int [] array) {
        Queue<Integer> odd = new ArrayDeque<>();//奇数
        Queue<Integer> even = new ArrayDeque<>();//偶数
        for (Integer i : array) {
            if((i & 1) == 1){
                odd.add(i);
            }else {
                even.add(i);
            }
        }
        int count = 0;
        for (Integer i : odd) {
            array[count++] = i;
        }
        for (Integer i : even) {
            array[count++] = i;
        }
    }
}
