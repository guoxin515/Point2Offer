package point2Offer;

import java.util.ArrayList;

/**
 * Created by GX on 2017/8/10.
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class _27_SearchTreeAndList {
    private ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        getList(pRootOfTree);
        int size = list.size();
        if(size == 1){
            return pRootOfTree;
        }
        for (int i = 0; i < size; i++) {
            if(i == 0){
                list.get(i).left = null;
                list.get(i).right = list.get(i + 1);
                continue;
            }
            if(i == size - 1){
                list.get(i).left = list.get(i - 1);
                list.get(i).right = null;
                continue;
            }
            list.get(i).left = list.get(i - 1);
            list.get(i).right = list.get(i + 1);

        }
        return list.get(0);
    }
    private void getList(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return;
        }
        getList(pRootOfTree.left);
        list.add(pRootOfTree);
        getList(pRootOfTree.right);
    }
}
