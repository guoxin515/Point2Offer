package point2Offer;

import java.util.Stack;

/**
 * Created by GX on 2017/8/9.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 */
public class _21_MinStackNum {
    private static final Stack<Integer> stack = new Stack();
    private static final Stack<Integer> stackAssist = new Stack();

    public void push(int node) {
        stack.push(node);
        if(stackAssist.isEmpty() ){
            stackAssist.push(node);
        }else if(node <= stackAssist.peek()){
            stackAssist.push(node);
        }else if(node > stackAssist.peek()){
            stackAssist.push(stackAssist.peek());
        }
    }

    public void pop() {
       stack.pop();
       stackAssist.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackAssist.peek();
    }
}
