package DSA.Queue_Example;

public class CircularQueue {
    
    int Queue[];
    int front;
    int rear; 
    int MaxSize;
    int count;

    void createCircular_Queue(int size) {
        rear = -1;
        front = 0;
        MaxSize = size;
        count = 0;
        Queue = new int[MaxSize];
    }

    
    void Enqueue(int e) {
        rear++;
        count++;
        Queue[rear] = e;   
    }

    boolean is_full() {

        if (count == MaxSize)
            return true;
        else
            return false;

        // return(rear==MaxSize-1);
    }

    int dequeue() {
        int temp = Queue[front];
        front++;
        count--;
        return (temp);
        
        // return(Queue[front++]);
    }

    boolean is_empty() {
        return(count == 0);
    }

    void print_Queue()// in LIFO
    {
        for (int i = front; i <= rear; i++)
            System.out.println(Queue[i] + "-");
    }

    public static void main(String[] args) {
        
    }
}
