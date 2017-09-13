package point2Offer;

/**
 * Created by GX on 2017/8/5.
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class _6_ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (null == pre || null == in || pre.length == 0 || in.length == 0) {
            return null;
        }
        int len = pre.length;
        return reConstruct(pre, 0, len - 1, in, 0, len - 1);
    }

    private TreeNode reConstruct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                root.left = reConstruct(pre, preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right = reConstruct(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
            }
        }
        return root;
    }
}
