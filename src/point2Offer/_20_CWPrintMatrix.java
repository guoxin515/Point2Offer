package point2Offer;

import java.util.ArrayList;

/**
 * Created by GX on 2017/8/8.
 * 顺时针打印矩阵
 */
public class _20_CWPrintMatrix {
    public static void main(String args[]) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        ArrayList<Integer> list = printMatrix(matrix);
        for (Integer i : list) {
            System.out.print(i);
        }
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; 2 * i < row && 2 * i < col; i++) {
            int endX = row - 1 - i;//边界
            int endY = col - 1 - i;//边界
            //step1，数组至少有一行
            for (int j = i; j <= endY; j++) {
                list.add(matrix[i][j]);
            }
            //如果执行step2，说明数组至少有2行
            if (i < endX) {
                for (int j = i + 1; j <= endX; j++) {
                    list.add(matrix[j][col - i - 1]);
                }
            }
            //如果执行step3，说明数组至少有2行2列
            if (i < endX && i < endY) {
                for (int j = endY - 1; j >= i; j--) {
                    list.add(matrix[row - i - 1][j]);
                }
            }
            //如果执行step4，说明数组至少有3行2列
            if (i < endX - 1 && i < endY) {
                for (int j = endX - 1; j >= i + 1; j--) {
                    list.add(matrix[j][i]);
                }
            }
        }
        return list;
    }
}
