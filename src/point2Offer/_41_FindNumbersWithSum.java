package point2Offer;

import java.util.ArrayList;

/**
 * Created by GX on 2017/8/29.
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class _41_FindNumbersWithSum {
    public static void main(String args[]) {
        int[] a = {1, 2, 4, 7, 11, 14};
        ArrayList<Integer> list = FindNumbersWithSum(a, 15);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null)
            return list;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (array[start] + array[end] < sum) {
                start++;
            } else if (array[start] + array[end] > sum) {
                end--;
            } else {
                list.add(array[start]);
                list.add(array[end]);
                break;
            }
        }
        return list;
    }
}
