package point2Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by GX on 2017/8/10.
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class _28_PrintString {
    private static HashSet<String> result = new HashSet<String>();
    private static ArrayList<String> list = new ArrayList<String>();

    public ArrayList<String> Permutation(String str) {
        list.removeAll(list);//处理这里的缓存问题
        result.removeAll(result);//处理这里的缓存问题

        permutation(str,0);
        list.addAll(result);
        Collections.sort(list);
        return list;
    }


    public static void permutation(String str,int start) {
        for (int i = 0; i+start < str.length(); i++) {
            char[] ch = str.toCharArray();
            char temp = ch[start];
            ch[start] = ch[start+i];
            ch[start+i] = temp;
            String string = str.valueOf(ch);
            result.add(string);
            permutation(string,start+1);
        }

    }
}