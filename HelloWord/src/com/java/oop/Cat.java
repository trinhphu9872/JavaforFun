package com.java.oop;

public class Cat extends Animal {
    private String fur;

    public Cat(String nameAnimal, boolean tail, String legAnimal, String kiloAnimal, String fur) {
        super(nameAnimal, tail, legAnimal, kiloAnimal);
        this.fur = fur;
    }

    @Override
    public void Eat(String food) {
//        super.Eat(food);
        System.out.println("Done");
    }
}
