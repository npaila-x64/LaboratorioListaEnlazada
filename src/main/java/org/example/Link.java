package org.example;

public class Link {
    public long iData;
    public Link next;
    public Link(long id) {
        iData = id;
    }
    public void displayLink() {
        System.out.print(iData + " ");
    }
}
