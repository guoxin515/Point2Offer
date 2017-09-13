package point2Offer;

import java.util.ArrayList;

/**
 * Created by GX on 2017/8/10.
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class _30_MinKNum {
    public static void main(String args[]){
        int[] array = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(array,4);
        for (Integer i: list) {
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length < k) {
            return list;
        }
        int len = input.length;
        int mid = k-1;
        int index = partition(input, 0, len-1);
        while (index != mid) {
            if (index < mid) {
                index = partition(input, index+1,len-1);
            } else if (index > mid) {
                index = partition(input, 0, index-1);
            }
        }
        for (int i = 0; i < input.length ; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private static int partition(int[] array, int low, int high){
        int pointKey;
        pointKey = array[low];
        while(low < high){
            while(low < high && array[high] >= pointKey){
                high--;
            }
            swap(array,low,high);
            while(low < high && array[low] <= pointKey){
                low++;
            }
            swap(array,low,high);
        }
        return low;
    }

    private static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
}


