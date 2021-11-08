package com.singlePaterm;

public class Messages {
    private String text;
    private String recipe;
    private int id;


    public void getDetail(){
        System.out.println("Contract Name" + recipe +
                "\nMessage" + text);
    }

    public Messages(String text, String recipe, int id) {
        this.text = text;
        this.recipe = recipe;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
