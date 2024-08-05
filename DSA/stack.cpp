#include <iostream>
const int MAX_SIZE = 100; // Maximum size of the queue
using namespace std;
class Queue {
public:
    int data[MAX_SIZE];
    int front;
    int rear;
    Queue() {
        front = -1;
        rear = -1;
    }
    bool isEmpty() {
        return (front == -1 && rear == -1);
    }
    bool isFull() {
        return (rear + 1) % MAX_SIZE == front;
    }
    void enqueue(int value) {
        if (isFull()) {
            cout << "Queue is full. Cannot enqueue more elements." << endl;
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX_SIZE;
        }
        data[rear] = value;
    }
    void dequeue() {
        if (isEmpty()) {
            cout << "Queue is empty. Cannot dequeue." << endl;
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX_SIZE;
        }
    }
    int peek() {
        if (isEmpty()) {
            cout << "Queue is empty. Cannot peek." << endl;
            return -1; // Indicate error with -1
        }
        return data[front];
    }
};

int main() {
    Queue queue;

    queue.enqueue(5);
    queue.enqueue(10);
    queue.enqueue(15);
    cout << "Front element: " << queue.peek() << endl;
    queue.dequeue();
    cout << "Front element after dequeue: " << queue.peek() << endl;
    return 0;
}
