package com.challange.done;

public class Stomach extends  Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("desgining is .....");
    }

    @Override
    public void getDetail() {
        super.getDetail();
        if (this.isEmpty()){
            System.out.println("Need eat now");
        }else {
            System.out.println("Stomach is full");
        }
    }



    public boolean isEmpty(){
        return this.isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
