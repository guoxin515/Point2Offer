package point2Offer;

/**
 * Created by GX on 2017/8/29.
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 */
public class _39_TreeDepth {
    /**
     * @Description :输入一棵二叉树，求该树的深度。
     */
    public int TreeDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    /**
     * @Description :输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        if(null == root){
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if(Math.abs(left-right) > 1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
}
