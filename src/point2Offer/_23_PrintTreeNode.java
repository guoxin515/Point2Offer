package point2Offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by GX on 2017/8/9.
 * 从上往下遍历二叉树
 */
public class _23_PrintTreeNode {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (null == root) {
            return arrayList;
        }
        arrayList.add(root.val);

        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.right != null) {
            queue.add(root.right);
        }
        while(!queue.isEmpty()){
            PrintFromTopToBottom(queue.poll());
        }
        return arrayList;
    }
}
