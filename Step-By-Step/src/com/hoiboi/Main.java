package com.hoiboi;

import com.hoiboi.Entity.Mob;
import com.hoiboi.Entity.Player;
import com.hoiboi.World.World;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String nameWorld = "";
    public static void main(String[] args) throws IllegalAccessException {
        System.out.print("Type name of your world: ");
        Scanner scanner = new Scanner(System.in);
        nameWorld = scanner.next();

        World newWorld = new World(nameWorld, 2);
        System.out.println("\nThe New World has been created successfully: " + newWorld);

        if(newWorld.getDifficult() == 1)
        {
            System.out.println("Difficult in this World: easy");
        } else if(newWorld.getDifficult() == 2)
        {
            System.out.println("Difficult in this World: normal");
        } else if(newWorld.getDifficult() == 3)
        {
            System.out.println("Difficult in this World: hard");
        } else
        {
            throw new IllegalAccessException("Error with difficult. Type again. [1 - 3]");
        }

        try {
            System.out.println("World loading...");

            Thread.sleep(3000);

            System.out.println("\n \n \n \n \n \n \n \n \n \n \nMobs were added.\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Player player1 = new Player(20, 5, "Steve", 0, 0);
        updatePlayerPos(newWorld.addMobs(), newWorld, player1);
    }

    public static void updatePlayerPos(ArrayList<Mob> mobArrayList, World newWorld, Player player1) throws IllegalAccessException {
        System.out.println(player1.getName() + "'s posX = " + player1.getX() + " / posY = " + player1.getY());

        mobArrayList.add(player1);
        System.out.println(mobArrayList);

        Scanner xx = new Scanner(System.in);
        System.out.print("\nType int move for xPos: ");
        int xFrom = xx.nextInt();
        if(xFrom > newWorld.getxMax() || xFrom < 0)
        {
            throw new IllegalAccessException("World is xMax = " + newWorld.getxMax());
        } else
        {
            System.out.println("You just moved on " + xFrom + " x points.");
            player1.setX(player1.getX() + xFrom);
            System.out.println(player1.getName() + "'s posX = " + player1.getX() + " / posY = " + player1.getY() + "\n");
            mobArrayList.set(2, new Player(player1.getHp(), player1.getDmg(), player1.getName(), player1.getX(), player1.getY()));
            playerPosWithMobs(player1, mobArrayList);
        }

        Scanner yy = new Scanner(System.in);
        System.out.print("\nType int move for yPos: ");
        int yFrom = yy.nextInt();
        if(yFrom > newWorld.getyMax() || yFrom < 0)
        {
            throw new IllegalAccessException("World is yMax = " + newWorld.getyMax());
        } else
        {
            System.out.println("You just moved on " + yFrom + " y points.");
            player1.setY(player1.getY() + yFrom);
            System.out.println(player1.getName() + "'s posX = " + player1.getX() + " / posY = " + player1.getY() + "\n");
            mobArrayList.set(2, new Player(player1.getHp(), player1.getDmg(), player1.getName(), player1.getX(), player1.getY()));
            playerPosWithMobs(player1, mobArrayList);
        }
    }

    public static void playerPosWithMobs(Player player1, ArrayList<Mob> mobArrayList)
    {
        for(int i = 0; i<mobArrayList.toArray().length;i++)
        {
                if(player1.getX() == mobArrayList.get(i).getX() && player1.getY() == mobArrayList.get(i).getY())
                {
                    if(i == 2)
                    {
                        return;
                    } else
                    {
                        System.out.println(player1.getName() + " encountered a " + mobArrayList.get(i).getName());
                        System.out.println("FIGHT!!! \n");
                    }
                } else
                    System.out.println("\n" + player1.getName() + " doesn't encountered anybody. \n" +
                            "Fail...");
        }
    }
}