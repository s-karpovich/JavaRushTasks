package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }


    @Override
    public synchronized int compareTo(Beach o) {

        return   this.getQuality() - o.getQuality() + (int)((o.getDistance() - this.getDistance()));
    }

    public static void main(String[] args) {
        Beach one = new Beach("One", 1.1f, 6);
        Beach two = new Beach("Two", 2.1f, 8);
        System.out.println(one.compareTo(two));
    }
}
