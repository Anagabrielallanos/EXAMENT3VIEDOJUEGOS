package com.example.anagabrielat3videojuegos.Entidades;

public class AnimeClass {

    String Name,Description,ImageUr;
    Boolean aBoolean;

    public AnimeClass(String name, String description, String imageUr, Boolean aBoolean) {
        Name = name;
        Description = description;
        ImageUr = imageUr;
        this.aBoolean = aBoolean;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageUr() {
        return ImageUr;
    }

    public void setImageUr(String imageUr) {
        ImageUr = imageUr;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
