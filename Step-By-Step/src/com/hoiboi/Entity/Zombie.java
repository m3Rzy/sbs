package com.hoiboi.Entity;

public class Zombie extends Mob{
    private static final String type = "Mob";
    private static final String name = "Zombie";
    private static final boolean angry = true;

    public Zombie(int hp, int dmg, int x, int y) {
        super(hp, dmg, angry, name, type, x, y);
    }
}
