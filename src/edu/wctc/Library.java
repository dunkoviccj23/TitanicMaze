package edu.wctc;

/**
 * Library extends Room and implements the Interact interface with just a few strings for description
 * and for when the Library is interacted with
 */

public class Library extends Room implements Interact {
    public String getRoomExplanation() {
        return "You find yourself in an old, timeless, and beautiful library full of books and fish as far as the eye can see.";
    }
    @Override
    public String interact() {
        return "You sight see around the room, stirring up dirt, and debris, while eels and fish flutter away from you in distress.";
    }
}
