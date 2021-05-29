package base.tree;

/**
 * @author weijiabin-work
 * @title: BinaryTree
 * @projectName algorithm-code
 * @description:
 * @date 2021/5/2910:17 上午
 */
public class BinaryTree {

    /**
     * 前序遍历
     * 根左右顺序遍历
     * @param root
     */
    public static void pre(CustomerTreeNode root){
        // 先输出根结点
        System.out.print(root.getData()+"-");

        // 左子树遍历
        if (null != root.getLeft()){
            pre(root.getLeft());
        }
        // 右子树遍历
        if (null != root.getRight()){
            pre(root.getRight());
        }
    }

    /**
     * 后序遍历
     * 左右根顺序遍历
     * @param root
     */
    public static void postorder(CustomerTreeNode root){
        // 左子树遍历
        if (null != root.getLeft()){
            postorder(root.getLeft());
        }

        // 右子树遍历
        if (null != root.getRight()){
            postorder(root.getRight());
        }

        System.out.print(root.getData()+"-");
    }


    /**
     * 中序遍历
     * 左中右顺序遍历
     * @param root
     */
    public static void inorder(CustomerTreeNode root){
        // 先遍历左子树
        if (null != root.getLeft()){
            inorder(root.getLeft());
        }
        // 输出根结点
        System.out.print(root.getData()+"-");
        //
        if (null != root.getRight()){
            inorder(root.getRight());
        }
    }

}
