#include <iostream>

const int MAX_SIZE = 100; // Maximum size of the list

using namespace std;

class ArrayList {
private:
    int data[MAX_SIZE];
    int size;
public:
    ArrayList() {
        size = 0;
    }

    void add(int value) {
        if (size < MAX_SIZE) {
            data[size] = value;
            size++;
        } else {
            cout << "List is full. Cannot add more elements." << endl;
        }
    }

    void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; ++i) {
                data[i] = data[i + 1];
            }
            size--;
        } else {
            cout << "Invalid index. Cannot remove element." << endl;
        }
    }

    int get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            cout << "Invalid index. Returning -1." << endl;
            return -1; // Indicate error with -1
        }
    }

    int getSize() {
        return size;
    }
};

int main() {
    ArrayList list;

    list.add(5);
    list.add(10);
    list.add(15);

    cout << "Element at index 1: " << list.get(1) << endl;

    list.remove(1);

    cout << "Element at index 1 after removal: " << list.get(1) << endl;

    return 0;
}
