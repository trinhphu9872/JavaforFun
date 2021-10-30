package com.java.oop;

public class Animal {
    private String nameAnimal;
    private boolean tail;
    private String legAnimal;
    private String kiloAnimal;

    public Animal(String nameAnimal, boolean tail, String legAnimal, String kiloAnimal) {
        this.nameAnimal = nameAnimal;
        this.tail = tail;
        this.legAnimal = legAnimal;
        this.kiloAnimal = kiloAnimal;
    }


    public void Eat(String food){

        System.out.println(this.getNameAnimal() + "eat Shit" );
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getLegAnimal() {
        return legAnimal;
    }

    public void setLegAnimal(String legAnimal) {
        this.legAnimal = legAnimal;
    }

    public String getKiloAnimal() {
        return kiloAnimal;
    }

    public void setKiloAnimal(String kiloAnimal) {
        this.kiloAnimal = kiloAnimal;
    }
}
