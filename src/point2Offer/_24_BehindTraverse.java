package point2Offer;

/**
 * Created by GX on 2017/8/9.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class _24_BehindTraverse {

    public boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if(len == 0){
            return false;
        }
        return verify(sequence,0,len-1);
    }
    public static boolean verify(int[] sequence,int first,int last){
        int mid = 0;
        boolean flag = true;
        if(first < last){
            int i = first;
            while(i < last){
                if(sequence[i] < sequence[last]){
                    i++;
                }else {
                    break;
                }
            }
            mid = i-1;
            while(i < last){
                if(sequence[i] > sequence[last]){
                    i++;
                }else {
                    flag = false;
                    break;
                }
            }
            if(!flag){
                return false;
            }else {
                return verify(sequence,first,mid) && verify(sequence,mid+1,last-1);
            }
        }
        return flag;
    }
}
