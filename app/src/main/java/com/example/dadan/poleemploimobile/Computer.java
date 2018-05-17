package com.example.dadan.poleemploimobile;

/**
 * Created by dadan on 15/05/2018.
 */

public class Computer {

    private String description;
    private int num; // computer id
    private int thumbnails;
    private BorneView.ETAT etat;

    public Computer() {
    }

    public Computer(String description, int num, int thumbnails) {
        this.description = description;
        this.num = num;
        this.thumbnails = thumbnails;
        this.etat = etat;
    }
    public Computer(String description, int num, BorneView.ETAT etat, int thumbnails) {
        this.description = description;
        this.num = num;
        this.thumbnails = thumbnails;
        this.etat = etat;
    }

    //getters and setters
    public String getDescription() {
        return description;
    }

    public int getNum() {
        return num;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public BorneView.ETAT getEtat() {
        return etat;
    }

    public void setEtat(BorneView.ETAT etat) {
        this.etat = etat;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
