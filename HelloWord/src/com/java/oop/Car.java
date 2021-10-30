package com.java.oop;

public class Car {
    private String name;
    private  int doors;
    private String Color;
    private Engine engine;

    public Car(String name, int doors, String color, Engine engine) {
        this.name = name;
        this.doors = doors;
        Color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    /**
     * get Engine
     * @return
     */

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
