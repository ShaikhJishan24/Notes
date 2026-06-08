package DSA.Queue_Example;

import java.util.Scanner;

public class QueueImpl {
    
    int Queue[];
    int front;
    int rear; 
    int MaxSize;

    void create_Queue(int size) {
        rear = -1;
        front = 0;
        MaxSize = size;
        Queue = new int[MaxSize];
    }

    //Enqueue
    void Enqueue(int e) {
        rear++;
        Queue[rear] = e;
        // Queue[++rear]=e;
    }

    boolean is_full() {
        if (rear == MaxSize - 1)
            return true;
        else
            return false;

        // return(rear == MaxSize-1);
    }

    int dequeue() {
        int temp = Queue[front];
        front++;
        return temp;
        // return(Queue[front++]);
    }

    boolean is_empty() {
        
        if (front > rear)
            return true;
        else
            return false;

        // return(front > rear);
    }

    void print_Queue()// in LIFO
    {
        for (int i = front; i <= rear; i++)
            System.out.println(Queue[i] + "-");
    }

    public static void main(String[] args) {

        QueueImpl obj = new QueueImpl();
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Queue:");
        int size = in.nextInt();
        obj.create_Queue(size);

        do {
            System.out.println("==========");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Print");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");

            choice = in.nextInt();
            
            switch (choice) {
                case 1:
                    if (!obj.is_full())// if not full then
                    {
                        System.out.println("Enter element :");
                        int e = in.nextInt();
                        obj.Enqueue(e);
                        System.out.println("Element pushed");
                    } else {
                        System.out.println("Queue is Full");
                    }
                    break;
                case 2:
                    if (!obj.is_empty())// if not empty then
                    {
                        System.out.println("Element poped:" + obj.dequeue());
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;
                case 3:
                    if (!obj.is_empty())// if not empty then
                    {
                        System.out.println("Queue has:");
                        obj.print_Queue();
                    } else {
                        System.out.println("Queue Empty");
                    }
                    break;
                case 0:
                    System.out.println("Thanks for using the code: amar.career");
                    break;
                default:
                    System.out.println("check the option selected.");
                    break;

            }
        } while (choice != 0);

        in.close();
    }
}
