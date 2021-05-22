package edu.wctc;

/**
 * EscapeRoom extends Room and implements the Escape interface with just a few strings for the description
 * and for when the user escapes
 */

public class EscapeRoom extends Room implements Escape {
    public String getRoomExplanation() {
        return "You see a gap in the hull large enough for your submarine! " +
                "Are you ready to go back to the surface (press 'x' to escape)?";
    }
    @Override
    public String escape() {
        return "You managed to escape the Titanic!";
    }
}
