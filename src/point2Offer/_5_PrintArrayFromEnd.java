package point2Offer;

import java.util.ArrayList;

/**
 * Created by GX on 2017/8/5.
 * 从尾到头打印链表
 */
public class _5_PrintArrayFromEnd {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //1.用栈实现
        /*Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (null == listNode) {
            return list;
        }
        while (null != listNode) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;*/

        //2、递归实现
        ArrayList<Integer> list = new ArrayList<>();
        if (null == listNode) {
            return list;
        }
        printList(list,listNode);
        return list;
    }

    private static void printList(ArrayList<Integer> list, ListNode listNode){
        if (null != listNode) {
            printList(list,listNode.next);
            list.add(listNode.val);
        }
        return;
    }
}
