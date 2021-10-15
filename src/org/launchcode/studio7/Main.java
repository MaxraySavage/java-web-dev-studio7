package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> trackList = new ArrayList<>();
        trackList.add("Blue by Eiffel65");
        trackList.add("All Star by Smash Mouth");
        trackList.add("Rock Superstar by Cypress Hill");

        CD mixTape = new CD("My Bar Mitzvah Mixtape", 6, trackList);

        ArrayList<String> chapterList = new ArrayList<>();
        chapterList.add("Hobbits in the shire");
        chapterList.add("Mines of moria");
        DVD lordOfTheRings= new DVD("The Fellowship of The Ring", 8, chapterList);


        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(mixTape.discInfo());
        System.out.println(lordOfTheRings.discInfo());

        mixTape.spinDisc();
        mixTape.readDisc();
        mixTape.readDisc();
        mixTape.readDisc();
        mixTape.readDisc();
        mixTape.readDisc();

        lordOfTheRings.spinDisc();
        lordOfTheRings.readDisc();
        lordOfTheRings.readDisc();
        lordOfTheRings.readDisc();
        lordOfTheRings.readDisc();

        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));
        System.out.println(mixTape.writeData("Funky song 12"));

    }
}
