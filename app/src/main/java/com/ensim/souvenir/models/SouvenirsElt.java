package com.ensim.souvenir.models;

public class SouvenirsElt {
    //fields
    private String image;
    private String name;
    private String date;
    private String lieu;

    //constructor
    public SouvenirsElt(String image, String name, String date, String lieu){
        this.image = image;
        this.name = name;
        this.date = date;
        this.lieu = lieu;
    }

    //méthodes
    public String getImage(){ return image; }
    public String getName(){ return name; }
    public String getDate(){ return date; }
    public String getLieu(){ return lieu; }
}
