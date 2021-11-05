package ex2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList[] queue;

    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public LinkedQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new LinkedList[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void enqueue(LinkedList elem) {
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }
        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }

    public LinkedList dequeue() {
        LinkedList temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public LinkedList element(){
        return queue[front++];
    }

    public void clear(){
        queue = new LinkedList[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }
}