package QueueDemo;

public class QueueDemo {

    private int maxSize;
    private int front;
    private int rear;
    private int currentSize;

    private int queueArray[];

    public QueueDemo(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.queueArray = new int[maxSize];
    }

    public void enQueue(int data){
        if (isQueueFull()){
            throw new RuntimeException("Queue is Full!!");
        }
            
        if (rear == maxSize-1){
            rear = -1;
        }
        queueArray[++rear] = data;
        System.out.println(data+" is added in Queue");
        currentSize++;
    }

    public int deQueue() {
        if (isQueueEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int result = queueArray[front++];
        if (front == maxSize){
            front = 0;
        }

        currentSize--;
        return result;
    }

    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    private boolean isQueueFull() {
        return maxSize == currentSize;
    }

    public int size() {
        return currentSize;
    }

}
