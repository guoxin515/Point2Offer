package point2Offer;

/**
 * Created by GX on 2017/8/1.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class _8_ArrayMinNum {
    public static void main(String args[]) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));

    }

    public static int minNumberInRotateArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        while (end - start != 1) {
            if (array[start] <= array[mid]) {
                start = mid;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return array[end];
    }
}
