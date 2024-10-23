import java.util.Scanner;

public class Game {

    private Player player;
    public Game(Player player) {
        GameMap gameMap = new GameMap();
        this.player = player;
        // Initialize enemies or locations as needed



    }

    public static void start(Player player) {
        Room currentRoom = GameMap.getStartingRoom();
        Scanner scan = new Scanner(System.in);

        System.out.println("Game is starting...");
        player.displayStatus();

        for(int i = 0; i < 5; i++){
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(currentRoom.getName() + ":");
        System.out.println(currentRoom.getDescription());

        System.out.println();
        String direction = scan.nextLine();

        switch(direction){
            case "a":
                break;
            case "s":
                break;
            case "d":
                break;
            case "f":
                break;
            default:
                System.out.println("InvalidEntry");
                break;
        }


    }
    public static void exploreRoom(){
        System.out.println("You find nothing but silence and anger. The energy in this room is deeply troubling.");
    }
    public static void talkToGuard(){
        System.out.println("Guard: 'Quiet trader!!'");
    }
    public static void attackBars(){
        System.out.println("You furiously punch at the bars in an effort to escape. It has no effect on the bars. You feel a searing pain.");
        Player.getHealth();
    }
    public static void rest(){}

}
