package edu.wctc;

/**
 * The room class has the getters/setters for the directions and exits.
 * @param direction the char equivalent direction for north, south, east, west
 */

public abstract class Room {
    private Room north = null, south = null, east = null, west = null;
    public abstract String getRoomExplanation();

    public Room getConnectingRoom(char direction) {
        if (direction == 'n') {
            return north;
        }
        if (direction == 's') {
            return south;
        }
        if (direction == 'e') {
            return east;
        }
        if (direction == 'w') {
            return west;
        }
        return null;
    }

    public String getExits() {
        String exits = "";
        if (this.isValidDirection('n')) {
            exits = exits + "North, ";
        }
        if (this.isValidDirection('s')) {
            exits = exits + "South, ";
        }
        if (this.isValidDirection('e')) {
            exits = exits + "East, ";
        }
        if (this.isValidDirection('w')) {
            exits = exits + "West, ";
        }
        return exits.substring(0, exits.length() - 2);
    }

    public boolean isValidDirection(char direction) {
        return this.getConnectingRoom(direction) != null;
    }

    public void setNorthRoom(Room room) {
        this.north = room;
    }

    public void setSouthRoom(Room room) {
        this.south = room;
    }

    public void setEastRoom(Room room) {
        this.east = room;
    }

    public void setWestRoom(Room room) {
        this.west = room;
    }
}
