package point2Offer;

import java.util.HashMap;

/**
 * Created by GX on 2017/8/10.
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class _26_ComplexListNodeCopy {
    public RandomListNode Clone(RandomListNode pHead) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        if (pHead == null) {
            return null;
        }
        RandomListNode pNext = pHead;
        while (pNext != null) {
            RandomListNode cloneListNode = new RandomListNode(pNext.label);
            map.put(pNext, cloneListNode);
            pNext = pNext.next;
        }

        pNext = pHead;
        while (pNext != null) {
            map.get(pNext).next = map.get(pNext.next);
            map.get(pNext).random = map.get(pNext.random);
            pNext = pNext.next;
        }
        return map.get(pHead);
    }
}
