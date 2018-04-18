package com.example.tientm.viewpager;

/**
 * Created by TienTM on 3/13/2018.
 */

public class Face {
    private String color;
    private int faceId;
    private String name;

    public Face(String color, int faceId, String name) {
        this.color = color;
        this.faceId = faceId;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getFaceId() {
        return faceId;
    }

    public String getName() {
        return name;
    }


}
