package com.hoiboi.Entity;

import java.util.ArrayList;

public abstract class Mob {
    private int hp;
    private int dmg;
    private boolean angry;
    private String name;
    private String type;
    private int x;
    private int y;

    public Mob(int hp, int dmg, boolean angry, String name, String type, int x, int y) {
        this.hp = hp;
        this.dmg = dmg;
        this.angry = angry;
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public boolean isAngry() {
        return angry;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Mob{" +
                "hp=" + hp +
                ", dmg=" + dmg +
                ", angry=" + angry +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
