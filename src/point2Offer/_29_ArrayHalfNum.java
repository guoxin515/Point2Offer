package point2Offer;

/**
 * 29、数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class _29_ArrayHalfNum {
    public static void main(String args[]){
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int len = array.length;
        int mid = len / 2;
        int index = partition(array, 0, len-1);
        while (index != mid) {
            if (index < mid) {
                index = partition(array, index+1,len-1);
            } else if (index > mid) {
                index = partition(array, 0, index-1);
            }
        }
        int num = array[index];
        if (halfThanArray(array, num)) {
            return num;
        }
        return 0;
    }

    private static boolean halfThanArray(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                count++;
        }
        if (count > array.length / 2)
            return true;
        return false;
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
