package base.tree;

/**
 * @author weijiabin-work
 * @title: CustomerNodeTree
 * @projectName algorithm-code
 * @description: 自定义树结构
 * @date 2021/5/2910:18 上午
 */
public class CustomerTreeNode {

    /**
     * 数据
     */
    private char data;

    /**
     * 左子树
     */
    private CustomerTreeNode left;

    /**
     * 右子树
     */
    private CustomerTreeNode right;


    public CustomerTreeNode(char data, CustomerTreeNode left, CustomerTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public CustomerTreeNode getLeft() {
        return left;
    }

    public void setLeft(CustomerTreeNode left) {
        this.left = left;
    }

    public CustomerTreeNode getRight() {
        return right;
    }

    public void setRight(CustomerTreeNode right) {
        this.right = right;
    }
}
