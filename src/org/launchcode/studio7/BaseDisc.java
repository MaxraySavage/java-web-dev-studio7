package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int capacity, String discType, ArrayList<String> contents) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = trimContents(contents, capacity);

    }

    private ArrayList<String> trimContents(ArrayList<String> contents, int capacity) {
        if(contents.size() > capacity) {
           return new ArrayList<>(contents.subList(0, capacity));
        }
        return contents;
    }

    public int getRemainingCapacity() {
        return capacity - contents.size();
    }

    public int getCapacityUsed() {
        return contents.size();
    }

    public String discInfo(){
        return String.format("\nDisk name: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, capacity, getCapacityUsed(), getRemainingCapacity());
    }

    public String writeData(ArrayList<String> data){
        if (data.size() > getRemainingCapacity()){
            return "Not enough disc space!";
        }
        contents.addAll(data);

        return "Data written to disc. Remaining space = " + getRemainingCapacity();
    }

    public String writeData(String datum ){
        if (getRemainingCapacity() < 1){
            return "Not enough disc space!";
        }
        contents.add(datum);

        return "Data written to disc. Remaining space = " + getRemainingCapacity();
    }

    public String readData(int index) {
        return contents.get(index);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public ArrayList<String> getContents() {
        return contents;
    }
}
