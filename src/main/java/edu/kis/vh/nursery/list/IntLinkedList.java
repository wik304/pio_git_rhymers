package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int TOP_ERROR_RETURN_VALUE = -1;
    private static final int POP_ERROR_RETURN_VALUE = -1;
    private Node last;
    int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    protected boolean isEmpty() {
        return last == null;
    }

    protected boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return TOP_ERROR_RETURN_VALUE;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return POP_ERROR_RETURN_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
