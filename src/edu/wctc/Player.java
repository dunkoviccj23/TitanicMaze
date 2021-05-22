package edu.wctc;

/**
 * The player class has the list of the item(s) for the player and a getter string for if the player has no items in their container
 */

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score = 0;
    List<String> subContainer = new ArrayList<>();

    public void addToSubContainer(String addItem) {
        subContainer.add(addItem);
    }

    public String getSubContainer() {
        if (subContainer.size() == 0) {
            return "There are no items in the submarine's container.";
        }
        return String.join(", ", subContainer);
    }
}
