import java.util.HashMap;
import java.util.Map;

public class GameMap {

    static Map<String, Room> rooms;

    public GameMap() {
        rooms = new HashMap<>();
        createRooms();
    }

    static void createRooms() {
        Room startingRoom = new Room("Prison Cell", "You awake in a dimly lit room on a stone floor. You look up to see the bars. You have been arrested. ");
        Room northRoom = new Room("North Room", "You are in a room with a high ceiling. There are doors to the east and south.");
        Room eastRoom = new Room("East Room", "You are in a small room with a window. There is a door to the west.");

        rooms.put("Prison Cell", startingRoom);
        rooms.put("northRoom", northRoom);
        rooms.put("eastRoom", eastRoom);

        // Connect the rooms
        startingRoom.addExit("north", northRoom);
        northRoom.addExit("south", startingRoom);
        northRoom.addExit("east", eastRoom);
        eastRoom.addExit("west", northRoom);
    }

    public static Room getRoom(String roomName) {
        return rooms.get(roomName);
    }

    public static Room getStartingRoom() {
        return rooms.get("Prison Cell");
    }
}