package org.example;

public class CircList {
    private Link current;
    private int count;

    public CircList() {
        count = 0;
        current = null;
    }

    public boolean isEmpty() {
        return count==0;
    }

    public void insertLink(int id) {
        Link newLink = new Link(id);
        if (current == null) {
            current = newLink;
            current.next = newLink;
        } else {
            Link temp = current;
            for (int i = 0; i < count - 1; i++) {
                temp = temp.next;
            }
            temp.next = newLink;
            newLink.next = current;
        }
        count++;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        for (int i = 0; i < count; i++) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayNext() {
        System.out.print("Next from current: ");
        current.next.displayLink();
        System.out.println();
    }

    public void displayCurrent() {
        System.out.print("Current: ");
        current.displayLink();
        System.out.println();
    }
}
