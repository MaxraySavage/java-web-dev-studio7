package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    private int currentTrack = 0;

    public CD(String name, int capacity, ArrayList<String> contents) {
        super(name, capacity, "Compact Disc", contents);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public void spinDisc() {
        System.out.println("Engaging subwoofer, point laser at disc, etc.");
    }

    @Override
    public void readDisc() {
        System.out.println("listening to: " + readData(currentTrack));
        currentTrack++;
        currentTrack = currentTrack % this.getContents().size();
    }



}
