package edu.wctc;

/**
 * The titanic class sets where all the rooms are as well as the interactions with each room
 * and a few getters as well relating to the interactions
 */

public class Titanic {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Titanic(Player player) {
        this.player = player;
        PendantRoom pendantRoom = new PendantRoom();
        Library library = new Library();
        EscapeRoom escapeRoom = new EscapeRoom();
        this.currentRoom = library;
        library.setNorthRoom(pendantRoom);
        pendantRoom.setSouthRoom(library);
        pendantRoom.setEastRoom(escapeRoom);
        escapeRoom.setWestRoom(pendantRoom);
    }

    public String interactCurrentRoom() {
        if (this.currentRoom instanceof Library) {
            return ((Library) this.currentRoom).interact();
        }
        return "There doesn't seem to be anything of interest in this room.";
    }

    public String excavateCurrentRoom() {
        if (this.currentRoom instanceof PendantRoom) {
            if (!this.player.getSubContainer().equals("Heart of the Ocean")) {
                this.player.addToSubContainer("Heart of the Ocean");
                return ((PendantRoom) this.currentRoom).excavateItem();
            }
        }
        return "There is nothing else worth excavating from this room.";
    }

    public String escapeCurrentRoom() {
        if (this.currentRoom instanceof EscapeRoom) {
            this.isFinished = true;
            return ((EscapeRoom) this.currentRoom).escape();
        }
        return "There is no way to escape the Titanic from this room.";
    }

    public boolean move(char direction) {
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getConnectingRoom(direction);
            return true;
        }
        return false;
    }

    public String getSubsContainer() {
        return this.player.getSubContainer();
    }

    public String getCurrentRoomExplanation() {
        return this.currentRoom.getRoomExplanation();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public boolean isFinished() {
        return this.isFinished;
    }
}
