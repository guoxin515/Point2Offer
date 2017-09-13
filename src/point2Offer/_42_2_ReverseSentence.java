package point2Offer;

/**
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class _42_2_ReverseSentence {
    public static void main(String args[]){
        System.out.println(ReverseSentence("I am a student."));
    }
    public static String ReverseSentence(String str) {
        if(null == str || "".equals(str.trim())){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] table = Reverse(str).split(" ");
        for (int i = 0; i < table.length - 1; i++) {
            sb.append(Reverse(table[i])).append(" ");
        }
        sb.append(Reverse(table[table.length - 1]));
        return sb.toString();
    }

    private static String Reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
