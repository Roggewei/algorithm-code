package base.queue;

import java.util.Queue;

/**
 * @author weijiabin-work
 * @title: ArrayQueue
 * @projectName algorithm-code
 * @description: 数组队列
 * @date 2021/5/2912:43 下午
 */
public class ArrayQueue <T> {
    /**
     * 队列最大长度
     */
    private int maxSize = 0;

    /**
     * 队列
     */
    private T[] queue;

    private int head = 0;

    private int tail = 0;

    public ArrayQueue(int maxSize){
        queue = (T[]) new Object[maxSize];
    }

    /**
     * 队列是否满了
     * @return
     */
    public boolean isFull(){
        return tail == maxSize-1;
    }

    /**
     * 队列是否为null
     * @return
     */
    public boolean isEmpty(){
        return tail == head;
    }


    /**
     * 入队
     * 队尾入，队首出
     * @param t
     * @return
     */
    public boolean offer(T t){
        if (isFull()){
            System.out.println("队列已满，无法入队");
            return false;
        }
        queue[tail++] = t;
        return true;
    }

    /**
     * 队首出队
     * @return
     */
    public T poll(){
        if (isEmpty()){
            System.out.println("队列已空，无法出队");
            return null;
        }
        return queue[head++];
    }


}
