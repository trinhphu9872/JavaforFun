package com.challange.done;

public class Skin  extends  Organ{
    private  String Color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        Color = color;
        this.softness = softness;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("My Skin color  "+ this.getColor());
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
