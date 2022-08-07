package com.hoiboi.Entity;

public class Player extends Mob{
    private static final String type = "Player";
    private static final boolean angry = true;


    public Player(int hp, int dmg, String name, int x, int y) {
        super(hp, dmg, angry, name, type, x, y);
    }


}
