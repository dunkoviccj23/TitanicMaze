package edu.wctc;

/**
 * PendantRoom extends Room and implements the ExcavateItem interface with just a few strings for description
 * and for when the item is added to the container
 */

public class PendantRoom extends Room implements ExcavateItem {
    public String getRoomExplanation() {
        return "You are in an ornate room with a massive bed and a slightly open chest on the nightstand. " +
                "Do you check what's inside?";
    }
    @Override
    public String excavateItem() {
        return "You have added the Heart of the Ocean pendant to your submarine's container.";
    }
}
