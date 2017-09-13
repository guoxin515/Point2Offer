package point2Offer;

/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 * 是不是很简单？OK，搞定它！
 */
public class _42_LeftRotateString {
    public static void main(String args[]){
        System.out.println(LeftRotateString("abcXYZdef",3));
    }
    public static String LeftRotateString(String str,int n) {
        if(str == null || str.length() < n){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(n));
        sb.append(str.substring(0,n));
        return sb.toString();
    }
}
