import base.tree.BinaryTree;
import base.tree.CustomerTreeNode;

/**
 * @author weijiabin-work
 * @title: TestTree
 * @projectName algorithm-code
 * @description: 树结构测试用例
 * @date 2021/5/2910:37 上午
 */
public class TestTree {
    /**
     * 构建测试树,结构如下
     */
    public static CustomerTreeNode buildTestTree () {
        CustomerTreeNode D = new CustomerTreeNode('D',null,null);
        CustomerTreeNode C = new CustomerTreeNode('C', D, null);
        CustomerTreeNode B = new CustomerTreeNode('B', null, C);
        CustomerTreeNode H = new CustomerTreeNode('H', null, null);
        CustomerTreeNode K = new CustomerTreeNode('K', null, null);
        CustomerTreeNode G = new CustomerTreeNode('G', H, K);
        CustomerTreeNode F = new CustomerTreeNode('F', G, null);
        CustomerTreeNode E = new CustomerTreeNode('E', null , F);
        CustomerTreeNode A = new CustomerTreeNode('A', B, E);
        return A;
    }

    public static void main(String[] args){
        CustomerTreeNode root = buildTestTree();
        // 前序遍历

        BinaryTree.pre(root);
        System.out.println("前序遍历");

        // 后序遍历
        BinaryTree.postorder(root);
        System.out.println("后序遍历");

        // 中序遍历
        BinaryTree.inorder(root);
        System.out.println("中序遍历");
    }
}
