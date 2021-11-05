package ex1;

public class ArrayQueueADT {
    public Object[] queue;

    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public ArrayQueueADT(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void enqueue(ArrayQueueADT queue, Object elem) {
        if (queue.rear == queue.maxSize - 1) {  // циклический перенос
            queue.rear = -1;
        }
        queue.queue[++rear] = elem;  //увеличение Rear и вставка
        queue.nElem++;  // увеличение количества элементов в очереди
    }

    public Object dequeue(ArrayQueueADT queue) {
        Object temp = queue.queue[queue.front++]; // получаем первый элемент из очереди

        if (queue.front == queue.maxSize) { // циклический перенос
            queue.front = 0;
        }
        queue.nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public Object element(ArrayQueueADT queue){
        return queue.queue[queue.front++];
    }

    public void clear(ArrayQueueADT queue){
        queue.queue = new Object[queue.maxSize];
        queue.rear = -1;
        queue.front = 0;
        queue.nElem = 0;
    }

    public boolean isEmpty(ArrayQueueADT queue) {
        return (queue.nElem == 0);
    }

    public int getSize(ArrayQueueADT queue) {
        return queue.nElem;
    }
}
