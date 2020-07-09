package QueueDemo;

public class ClientTest {

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo(5);
        queueDemo.enQueue(10);
        queueDemo.enQueue(10);
        queueDemo.enQueue(20);
        queueDemo.enQueue(30);
        queueDemo.enQueue(40);
        queueDemo.enQueue(50);

        queueDemo.deQueue();

        queueDemo.enQueue(60);

        System.out.println("The size of queue is: " + queueDemo.size());
    }

}
