package com.challange.done;

public class Eye extends Organ{
    private String Color;
    private Boolean isOpened;

    public Eye(String name, String medicalCondition, String color, Boolean isOpened) {
        super(name, medicalCondition);
        Color = color;
        this.isOpened = isOpened;
    }


    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Color: " + this.getColor());
    }

    public void open(){
        this.isOpened = true;
        System.out.println(this.getName() + " Open");
    }
    public  void closed(){
        this.isOpened = false;
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getOpened() {
        return isOpened;
    }

    public void setOpened(Boolean opened) {
        isOpened = opened;
    }
}
