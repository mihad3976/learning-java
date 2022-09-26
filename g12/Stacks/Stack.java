package Stacks;

public class Stack {
    private int[] items;
    private int numItems;

    public Stack() {
        this.items = new int[10];
        this.numItems = 0;
    }

    public boolean isEmpty() {
        return numItems == 0 ? true : false;
    }

    public int getSize() {
        return this.numItems;
    }

    public int getPeak() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty.");
        } else {
            return this.items[this.numItems - 1];
        }
    }

    public int pop() {
        int lastItem = this.getPeak();
        this.numItems--;
        this.items[this.numItems] = 0;
        return lastItem;
    }

    public void push(int value) {
        if (this.numItems < this.items.length) {
            this.items[this.numItems] = value;
            this.numItems++;
        } else {
            int[] temp = new int[this.numItems * 2];
            for (int i = 0; i < this.numItems; i++) {
                temp[i] = items[i];
            }
            this.items = temp;
            this.items[this.numItems] = value;
            this.numItems++;
        }
    }

    public static void main(String[] args) {
        Stack myNums = new Stack();
        myNums.push(7);
        myNums.push(-2);
        System.out.println(myNums.getPeak());
        System.out.println(myNums.getSize());
        System.out.println(myNums.pop());
        System.out.println(myNums.getSize());
    }
}