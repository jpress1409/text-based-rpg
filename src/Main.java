import java.util.Scanner;

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        player.displayStatus();
        // Create a new Game instance and start it



        scan.close();
    }
}