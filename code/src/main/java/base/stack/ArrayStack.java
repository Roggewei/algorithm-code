package base.stack;
/**
 * @author weijiabin-work
 * @title: ArrayStack
 * @projectName algorithm-code
 * @description: 底层是数组的栈实现
 * @date 2021/5/2911:32 上午
 */
public class ArrayStack <T>{

    private int maxSize; //栈大小

    private T[] stack;

    private int top = -1;//栈顶位置

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = (T[]) new Object[maxSize];
    }

    /**
     * 判断是否栈满
     * @return
     */
    public boolean isFull(){
        return top == maxSize - 1;
    }

    /**
     * 是否空栈
     * @return
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 入栈
     * @param data
     */
    public void push(T data){
        // 判断是否满栈
        if (isFull()){
            System.out.println("栈已满");
            return;
        }
        // 未满入栈
        stack[++top] = data;
    }

    public T pop(){
        // 判断是否栈空
        if (isEmpty()){
            System.out.println("栈已空");
            return null;
        }
        return stack[top--];
    }

    /**
     * 遍历栈
     */
    public void list (){
        // 判断是否栈空
        if (isEmpty()){
            System.out.println("栈已空-无需遍历");
            return;
        }
        for (int i = top; i >-1; i--){
            System.out.println(stack[i]);
        }
    }
}
