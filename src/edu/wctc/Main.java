package edu.wctc;

/**
 * Main declares a few new objects per the associated classes, and has all the user print lines / navigation
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        Titanic titanic = new Titanic(player);

        while (!titanic.isFinished()) {
            System.out.println(titanic.getCurrentRoomExplanation());
            System.out.println("Room entrances in sight: " + titanic.getCurrentRoomExits());
            System.out.println("Enter in the direction[n, s, e, w] or interact[i] or excavate item[v] or escape[x] or check submarine's container[c].");
            char direction = keyboard.next().charAt(0);
            if (direction == 'x') {
                System.out.println(titanic.escapeCurrentRoom());
            } else if (direction == 'i') {
                System.out.println(titanic.interactCurrentRoom());
            } else if (direction == 'v') {
                System.out.println(titanic.excavateCurrentRoom());
            } else if (direction == 'c') {
                System.out.println(titanic.getSubsContainer());
            } else if (!titanic.move(direction)) {
                System.out.println("That is not a valid direction.");
            }
        }
    }
}
