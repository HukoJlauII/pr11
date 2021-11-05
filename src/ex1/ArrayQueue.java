package ex1;

public class ArrayQueue<E> {
    public E[] queue;

    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = (E[])new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void enqueue(Object elem) {
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }
        queue[++rear] = (E)elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }

    public Object dequeue() {
        Object temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public Object element(){
        return queue[front++];
    }

    public void clear(){
        queue = (E[]) new Object[maxSize];
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
