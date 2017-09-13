package point2Offer;

/**
 * Created by GX on 2017/8/29.
 */
public class _39_2_TreeDepth {
    public boolean IsBalanced_Solution(TreeNode root) {
        boolean[] flag = {true};
        getHeight(root, 0, flag);
        return flag[0];
    }

    private int getHeight(TreeNode root, int level, boolean[] flag) {
        if (root == null) {
            return level;
        }
        int lH = getHeight(root.left, level + 1, flag);

        int rH = getHeight(root.right, level + 1, flag);

        if(Math.abs(lH - rH) > 1){
            flag[0] = false;
        }
        return Math.max(lH,rH);
    }
}
