package com.company;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Dictionary;

public class Card {
    private String category;
    private int Sorting_number;
    private String name;
    private String series;
    private String player;
    private Base64 mainImage;
    private Base64 subCategoryImage;
    private Base64 difficultyLevelImage;
    private Dictionary <String,String> seriesCrdsNames;

    public Card (String category,int Sorting_number,String name,String series,String player){
        this.category = category;
        this.Sorting_number = Sorting_number;
        this.name = name;
        this.series = series;
        this.player = player;
    }

    public String getCategory() {
        return category;
    }

    public int getSorting_number() {
        return Sorting_number;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    public String getPlayer() {
        return player;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSorting_number(int sorting_number) {
        Sorting_number = sorting_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Base64 getMainImage() {
        return mainImage;
    }

    public void setMainImage(Base64 mainImage) {
        this.mainImage = mainImage;
    }

    public Base64 getSubCategoryImage() {
        return subCategoryImage;
    }

    public void setSubCategoryImage(Base64 subCategoryImage) {
        this.subCategoryImage = subCategoryImage;
    }

    public Base64 getDifficultyLevelImage() {
        return difficultyLevelImage;
    }

    public void setDifficultyLevelImage(Base64 difficultyLevelImage) {
        this.difficultyLevelImage = difficultyLevelImage;
    }

    public Dictionary<String, String> getSeriesCrdsNames() {
        return seriesCrdsNames;
    }

    public void setSeriesCrdsNames(Dictionary<String, String> seriesCrdsNames) {
        this.seriesCrdsNames = seriesCrdsNames;
    }
}
