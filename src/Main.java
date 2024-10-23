import java.util.Scanner;

// Main class to run the program
public class Main {

    private int health;
    private int stamina;
    private int mana;
    private int armor;
    private String name;
    private PlayerType type;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GameMap gameMap = new GameMap();
        Room currentRoom = GameMap.getStartingRoom();

        // Set player name

            System.out.println("Enter player name: ");
            String playerName = scan.nextLine();

        PlayerType selectedType = null;

        // Display available player types
        System.out.println("Select player type:");
        for (PlayerType type : PlayerType.values()) {
            System.out.println("- " + type);
        }
        System.out.println("Enter player type: ");
        String inputType = scan.nextLine().toUpperCase();

        // Validate and set player type
        try {
            selectedType = PlayerType.valueOf(inputType);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid player type selected. Defaulting to WARRIOR.");
            selectedType = PlayerType.WARRIOR; // Default to WARRIOR if invalid
        }

        // Create player and display status
        Player player = new Player(selectedType, playerName, selectedType.getHealth(), selectedType.getStamina(), selectedType.getMana(), selectedType.getArmorRating());

        Game.start(player);
        boolean loop = true;
        while(loop == true) {
            System.out.println("What would you like to do?");
            String choice = scan.next();

            switch (choice) {
                case "a":
                    exploreRoom();
                    break;
                case "s":
                    talkToGuard();
                    break;
                case "d":
                    player.attackBars();
                    break;
                case "f":
                    rest(player);
                    System.out.println("Take Key?");
                    String keyChoice = scan.nextLine();
                    if (keyChoice.equalsIgnoreCase("yes")) {
                        System.out.println("You unlocked the door!");
                        loop = false;
                    }

                    break;
                default:
                    System.out.println("InvalidEntry");
                    break;
            }
        }
            loop = true;
            while(loop == true){
            System.out.println("You look around. Being careful not to wake the guard. To your left you see and chest. Open it?");
            String chestChoice = scan.nextLine();

            if(chestChoice.equalsIgnoreCase("yes")) {
                System.out.println("You find your clothes and weapon. You take them.");
                loop = false;
            }
            }

        System.out.println("What should you do next?");
        System.out.println("(a) Attack the guard");
        System.out.println("(s) Sneak sneak up the stairs?");
        String initialChoice = scan.nextLine().toUpperCase();

        if(initialChoice.equals("A")){

        }else()


            }



    public static void exploreRoom(){
        System.out.println("You find nothing but silence and anger. The energy in this room is deeply troubling.");
    }
    public static void talkToGuard(){
        System.out.println("Guard: 'Quiet trader!!'");
    }

    public static void rest(Player player){
        System.out.println("You laid down and went to sleep.");
        for(int i = 0; i < 4; i++){
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
            player.setHealthMax();
            System.out.println("You awoke feeling rested. Health: " + player.getHealth() + " " +
                    "The guard is asleep. You notice a key dangling from his waist. It's just within reach.");
        }

    }

    public static void attackGuard(){
        Player.battleMechWarrior();
    }
}