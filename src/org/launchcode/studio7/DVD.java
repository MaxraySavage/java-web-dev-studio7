package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    private int currentChapter = 0;

    public DVD(String name, int capacity, ArrayList<String> contents) {
        super(name, capacity, "DVD", contents);
    }

    public DVD(String name, int capacity) {
        this(name, capacity, new ArrayList<>());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("DVD spin faaast");
    }

    @Override
    public void readDisc() {
        System.out.println("watching: " + readData(currentChapter));
        currentChapter++;
        currentChapter = currentChapter % this.getContents().size();
    }

}
