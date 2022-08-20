package Leet_Code.Easy;

import java.util.Stack;

public class _232_My_Queue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public _232_My_Queue() {
        s1 = new Stack<>();
         s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.isEmpty()) s1.push(x);
        else {
            while (!s1.isEmpty()) s2.push(s1.pop());

            s1.push(x);

            while (!s2.isEmpty()) s1.push(s2.pop());

        }

    }

    public int pop() {
        return s1.isEmpty() ? -1:s1.pop();
    }

    public int peek() {
        return s1.isEmpty() ? -1:s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
