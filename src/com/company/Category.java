package com.company;

public class Category {
    private String name;
    private String father;
    private int Id;
    private int level;

    public Category (String name,String father,int Id,int level){
        this.name = name;
        this.father = father;
        this.Id = Id;
        this.level = level;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
}
