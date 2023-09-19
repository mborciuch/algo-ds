package org.javainterviewquestion;

public class StackAndQueue35 {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("to");
        stack.push("you");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

}

class MyStack<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());  // Output: 3
        System.out.println(stack.peek()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.size()); // Output: 2
    }
}
