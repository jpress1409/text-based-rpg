import java.util.Scanner;

public class Game {
    private Player player;
    public GameMap gameMap;
    public Game(Player player) {
        GameMap gameMap = new GameMap(5, 5);
        this.player = player;
        this.gameMap = new GameMap(5, 5);
        // Initialize enemies or locations as needed

        // Set the player's initial location
        player.setCurrentLocation();
    }

    public void start() {
        System.out.println("Game is starting...");
        player.displayStatus();
        /*Location startLocation = new Location("You are in a dark forest. It's quiet and eerie.");
        gameMap.addLocation(0, 0, startLocation); // Set start location at (0, 0)*/

    }
}
