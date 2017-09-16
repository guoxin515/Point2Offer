package point2Offer;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */
public class _48_StrToInt {
    public static void main(String args[]){
        System.out.println(StrToInt("-1L23"));
    }
    public static int StrToInt(String str) {
        if (null == str || "".equals(str.trim())) {
            return 0;
        }
        char[] ch = str.toCharArray();
        if (ch[0] != '+' && ch[0] != '-' && (ch[0] > '9' || ch[0] < '0')) {
            return 0;
        }
        if (ch[0] == '+') {
            return strToIntCore(ch, 1, 1);//正数
        } else if (ch[0] == '-') {
            return strToIntCore(ch, 1, -1);//负数
        }
        return strToIntCore(ch, 0, 1);//没有+/—,默认为正数
    }

    private static int strToIntCore(char[] ch, int index, int flag) {
        int num = 0;
        for (int i = index; i < ch.length; i++) {
            if (ch[i] <= '9' && ch[i] >= '0') {
                num = 10 * num + ch[i] - '0';
            }else {
                return 0;//不是一个合法的数值则返回0
            }
        }
        return flag * num;
    }
}
