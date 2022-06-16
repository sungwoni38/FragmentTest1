package com.example.fragmenttest1;

public class TabItem {
    private String food; //음식 사진
    private String name;

    public TabItem(String food, String name) {
        this.food = food;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
