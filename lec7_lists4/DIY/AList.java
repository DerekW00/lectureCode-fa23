package lec7_lists4.DIY;

/**
 * This is a fill in the blanks version of the SLList class
 * in case you want to try to figure out how to write it yourself.
 * After writing your methods, you can run the AListTest file.
 */
public class AList {
    int[] items;
    int size;
    int RFACTOR;

    /**
     * Creates an empty list.
     */
    public AList() {
        items = new int[100];
        size = 0;
    }

    private void resize(int capacity){

            int[] a = new int[size + 1];
            System.arraycopy(items, 0, a, 0, size);
            items = a;

    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(int x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size = size + 1;
    }

    /**
     * Returns the item from the back of the list.
     */
    public int getLast() {
        int last = size - 1;
        return items[last];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public int get(int i) {
        return items[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public int removeLast() {
        int temp = items[size];
        items[size] = 0;
        size--;
        return temp;
    }
} 