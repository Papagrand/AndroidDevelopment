package com.example.homework9;

public class FlowerInfo {
    private String name;
    private String LatinName;
    private int imgResource;

    public FlowerInfo(String name,String LatinName, int img){
        this.name=name;
        this.LatinName=LatinName;
        this.imgResource=img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return LatinName;
    }

    public void setLatinName(String latinName) {
        LatinName = latinName;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
