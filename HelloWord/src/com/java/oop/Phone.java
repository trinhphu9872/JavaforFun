package com.java.oop;

public class Phone {
     private String namePhone ;
     private int screenSize ;
     private int countPhone;
     private int cameraPhone;

     public Phone(){
        this.namePhone = "Iphone";
        this.screenSize= 6;
     }
     public Phone(int Count,int Cam){
         this.countPhone = Count;
         this.cameraPhone = Cam;
     }


    public Phone(String namePhone, int screenSize, int countPhone, int cameraPhone) {
        this.namePhone = namePhone;
        this.screenSize = screenSize;
        this.countPhone = countPhone;
        this.cameraPhone = cameraPhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

}
