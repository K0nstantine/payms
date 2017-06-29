package com.example.mypaims.app.entities;

import android.graphics.Color;
import android.media.Image;

/**
 * Created by kos on 18.06.16.
 */
public class Category {
    private String name;
    private Image picture;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
