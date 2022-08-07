package com.hoiboi.World;

import com.hoiboi.Entity.Mob;
import com.hoiboi.Entity.Player;
import com.hoiboi.Entity.Zombie;

import java.util.ArrayList;
import java.util.Random;

public class World {
    private String name;
    private int difficult;
    private int xMax = 30;
    private int yMax = 30;

    static int getRandomInt(){
        int r = (int) (Math.random()*4);
        int pos = new int [] {1,2,3,4}[r];
        return pos;
    }

    public ArrayList<Mob> addMobs()
    {
        ArrayList<Mob> mobArrayList = new ArrayList<>();

        for(int i = 0; i<2; i++)
        {
            mobArrayList.add(new Zombie(10, 4, getRandomInt(), getRandomInt()));
        }
        return mobArrayList;
    }

    public World(String name, int difficult) {
        this.name = name;
        this.difficult = difficult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    @Override
    public String toString() {
        return "World{" +
                "name='" + name + '\'' +
                ", difficult=" + difficult +
                '}';
    }
}
