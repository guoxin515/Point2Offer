package point2Offer;

/**
 * Created by GX on 2017/8/15.
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class _36_InversePairs {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(array));
    }

    static int count = 0;
    public static int InversePairs(int [] array) {
        sort(array, 0, array.length - 1);
        return count;
    }

    private static void sort(int[] array, int left, int right) {
        if(left < right){
            int mid = (left + right) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            mergee(array,left,mid,right);
        }
    }

    private static void mergee(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int leftIndex = mid;
        int rightIndex = right;
        int tempIndex = temp.length - 1;
        while(leftIndex >= left && rightIndex >= mid + 1){
            if(array[leftIndex] > array[rightIndex]){
                temp[tempIndex--] = array[leftIndex--];
                count += rightIndex - mid;
                count %= 1000000007;
            }else {
                temp[tempIndex--] = array[rightIndex--];
            }
        }
        while(leftIndex >= left){
            temp[tempIndex--] = array[leftIndex--];
        }
        while(rightIndex >= mid + 1){
            temp[tempIndex--] = array[rightIndex--];
        }
        int tempData = 0;
        while ((left + tempData) <= right){
            array[left + tempData] = temp[tempData];
            tempData++;
        }
    }


}
