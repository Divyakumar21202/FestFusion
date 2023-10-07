package com.example.bloodonor;

public class CollegeClassModel {
    CollegeClassModel(){

    }
    String Images;
    String NAME;
    public CollegeClassModel(String images, String NAME) {
        Images = images;
        this.NAME = NAME;

    }

    public String getImages() {
        return Images;
    }

    public String getNAME() {
        return NAME;
    }

    public void setImages(String images) {
        Images = images;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

}
