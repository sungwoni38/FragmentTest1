package com.example.fragmenttest1;

public class CardItem {
    private String name;
    private String call;
    private String add;
    private String like; //즐겨찾기 이미지 클릭 이벤트

    public CardItem(String name, String call, String add, String like) {
        this.name = name;
        this.call = call;
        this.add = add;
        this.like = like;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
