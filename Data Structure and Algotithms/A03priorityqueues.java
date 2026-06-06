import java.util.*;

public class A03priorityqueues {
    public static void main(String[] args) {
        
        // Priority Queue = A FIFO data structure that serves elements
        //                  with the heighest priorities first
        //                  before elements with lower priority

        Queue<Double> queue = new PriorityQueue<>(); //Collections.reverseOrder() เปลี่ยนเรียงจากมากสุด ไป น้อยสุด

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) { 
            System.out.println(queue.poll());
        }
    }
}
