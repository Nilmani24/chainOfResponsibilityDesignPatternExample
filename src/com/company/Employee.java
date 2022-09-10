package com.company;

public class Employee {
    private int emplId;
    private boolean isFree;
    private int level;
    private String name;

    public int getEmplId() {
        return emplId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

