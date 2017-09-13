package point2Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by GX on 2017/8/15.
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class _33_PrintMinNumber {
    public static void main(String args[]) {
        int[] array = {3,32,321};
        System.out.println(PrintMinNumber(array));
    }

    public static String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i : numbers) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String m = o1 + "" + o2;
                String n = o2 + "" + o1;
                return m.compareTo(n);
            }
        });
        for (Integer i : list) {
            sb.append(String.valueOf(i));
        }
        return sb.toString();
    }
}

