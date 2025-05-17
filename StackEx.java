package javaapplication41;

class Stack {
    private int top;
    private int[] stackArray;
    private int size;

    Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    void push(int item) {
        if (isfull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = item;
        System.out.println("Pushed item"+item+" to the stack");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Element popped is "+stackArray[top]);
        top--;
    }
   int peek(){
       return stackArray[top];
   }
   
    boolean isfull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int isSize() {
        return top + 1;
    }
    
   void display(){
       for(int i=top; i>=0;i--){
           System.out.println(stackArray[i]);
           
       }
   }
}

public class StackEx {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.display();
        stack.pop();
        System.out.println("Current size: " + stack.isSize());
        System.out.println("peek value is:"+ stack.peek());
        
    }
}
