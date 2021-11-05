package ex1;

import ex1.ArrayQueue;
import ex1.ArrayQueueADT;
import ex1.ArrayQueueModule;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule queue1=new ArrayQueueModule(4);
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

        int n1=(int)queue1.dequeue();
        System.out.println("Очередь после удаления первых 3х элементов (ArrayQueueModule)");
        System.out.println(n1);
        System.out.println();


        ArrayQueueADT queue2=new ArrayQueueADT(5);
        queue2.enqueue(queue2,5);
        queue2.enqueue(queue2,4);
        queue2.enqueue(queue2,3);
        queue2.enqueue(queue2,2);
        queue2.enqueue(queue2,1);

        queue2.dequeue(queue2);
        queue2.dequeue(queue2);
        queue2.dequeue(queue2);

        System.out.println("Очередь после удаления первых 3х элементов (ArrayQueueADT)");
        while (!queue2.isEmpty(queue2)) {
            int n2 = (int)queue2.dequeue(queue2);
            System.out.println(n2);
        }

        ArrayQueue queue3=new ArrayQueue(3);
        queue3.enqueue("five");
        queue3.enqueue("four");
        queue3.enqueue("free");

        queue3.dequeue();

        System.out.println();
        System.out.println("Очередь после удаления первого элементов (ArrayQueue)");
        while (!queue3.isEmpty()) {
            String n3 = (String) queue3.dequeue();
            System.out.println(n3);
        }

    }
}