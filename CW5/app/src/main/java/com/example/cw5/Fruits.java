package com.example.cw5;

import java.io.Serializable;

public class Fruits implements Serializable {
    private String fruitName;
    private double fruitPrice;
    private String fruitImg;

    public Fruits() {
    }

    public Fruits(String fruitName, double fruitPrice, String fruitImg) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitImg = fruitImg;
    }


    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public String getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(String fruitImg) {
        this.fruitImg = fruitImg;
    }
}
