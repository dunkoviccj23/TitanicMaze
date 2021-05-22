package edu.wctc.test;

/**
 * Added a few tests for the escape room for the exits in the room, if a direction is valid, and for the connecting room
 */

import edu.wctc.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoomTest {

    @Test
    void getExits() {
        Room testRoom = new EscapeRoom();
        Room southRoom = new EscapeRoom();
        Room northRoom = new EscapeRoom();

        testRoom.setSouthRoom(southRoom);
        testRoom.setNorthRoom(northRoom);

        Assertions.assertTrue(testRoom.getExits().equals("North, South"));
    }

    @Test
    void isValidDirection() {
        Room testRoom = new EscapeRoom();
        Room southRoom = new EscapeRoom();

        testRoom.setSouthRoom(southRoom);

        Assertions.assertTrue(testRoom.isValidDirection('s'));
        Assertions.assertFalse(testRoom.isValidDirection('n'));
        Assertions.assertFalse(testRoom.isValidDirection('w'));
        Assertions.assertFalse(testRoom.isValidDirection('e'));
    }

    @Test
    void getConnectingRoom() {
        Room testRoom = new EscapeRoom();
        Room southRoom = new EscapeRoom();

        testRoom.setSouthRoom(southRoom);

        Assertions.assertTrue(testRoom.getConnectingRoom('s').equals(southRoom));
        Assertions.assertTrue(testRoom.getConnectingRoom('n').equals(null));
        Assertions.assertTrue(testRoom.getConnectingRoom('w').equals(null));
        Assertions.assertTrue(testRoom.getConnectingRoom('e').equals(null));
    }
}
