package base.tree;

import base.queue.ArrayQueue;
import base.stack.ArrayStack;

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


    /**
     * 广度优先的层次遍历
     * 利用栈的先入后出性质
     * 递归实现
     * @param root
     */
    public static void bfs(CustomerTreeNode root){
        ArrayQueue arrayQueue = new ArrayQueue(9);
        CustomerTreeNode[] treeNodes = new CustomerTreeNode[9];
        int i = 8;
        arrayQueue.offer(root);
        while (!arrayQueue.isEmpty()){
            CustomerTreeNode node = (CustomerTreeNode) arrayQueue.poll();
            treeNodes[i--] = node;
            if (null != node.getRight()){
                arrayQueue.offer(node.getRight());
            }
            if (null != node.getLeft()){
                arrayQueue.offer(node.getLeft());
            }
        }

        // 输出结果
        for (int j =0; j<9; j++){
            System.out.print(treeNodes[j].getData()+"-");
        }
    }


    /**
     * 深度优先的层次遍历
     * 利用栈的先入后出性质
     * @param root
     */
    public static void dfs(CustomerTreeNode root){
        ArrayStack stack = new ArrayStack(9);
        ArrayStack stackValue = new ArrayStack(9);
        stack.push(root);
        while(!stack.isEmpty()){
            CustomerTreeNode node = (CustomerTreeNode) stack.pop();
            stackValue.push(node.getData());
            if (null != node.getLeft()){
                stack.push(node.getLeft());
            }
            if (null != node.getRight()){
                stack.push(node.getRight());
            }
        }
        stackValue.list();
    }

}
