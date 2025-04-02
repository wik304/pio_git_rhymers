package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int TOP_ERROR_RETURN_VALUE = -1;
    private static final int POP_ERROR_RETURN_VALUE = -1;
    private Node last;
    int i;

    public static int getTopErrorReturnValue() {
        return TOP_ERROR_RETURN_VALUE;
    }

    public static int getPopErrorReturnValue() {
        return POP_ERROR_RETURN_VALUE;
    }

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return POP_ERROR_RETURN_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
