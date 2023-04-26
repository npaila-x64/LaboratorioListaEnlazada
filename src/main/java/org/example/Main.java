package org.example;

public class Main {
    public static void main(String[] args) {
        CircList cl = new CircList();
        cl.displayList();
        cl.insertLink(3);
        cl.displayList();
        cl.displayCurrent();
        cl.displayNext();

        cl.insertLink(5);
        cl.displayList();
        cl.displayCurrent();
        cl.displayNext();

        cl.insertLink(10);
        cl.displayList();
        cl.displayCurrent();
        cl.displayNext();
    }
}