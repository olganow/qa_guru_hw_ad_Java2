package ru.ya.olganow.Array;

public class Apartmemt {
    int price;
    String residentialName;
    boolean isStudio;
    int size;
    int numberOfRoom;
    int floor;

    String[] finishes;

    public Apartmemt(int price, String residentialName, boolean isStudio, int size, int numberOfRoom, int floor) {
        this.price = price;
        this.residentialName = residentialName;
        this.isStudio = isStudio;
        this.size = size;
        this.numberOfRoom = numberOfRoom;
        this.floor = floor;
    }

    public void setFinishes(String[] finishes) {
        this.finishes = finishes;
    }
}
