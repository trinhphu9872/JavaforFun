package com.challange.done;

public class Heart extends Organ {
    private int rate;


    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Heart Rate : " + this.getRate());
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
}
