import java.util.Random;

public class Player {
    private static int health;
    private int stamina;
    private int mana;
    private int armor;
    private String name;
    private PlayerType type;
    public int baseDamage = 5;
    private int damage;
    private int x, y;
    private GameMap gameMap;
    private int maxHealth;
    private Game Guard;

    // Constructor
    public Player(PlayerType type, String name, int health, int stamina, int mana, int armor) {
        this.type = type; // Initialize type
        this.name = name; // Initialize name
        this.health = health; // Initialize health
        this.stamina = stamina; // Initialize stamina
        this.mana = mana; // Initialize mana
        this.armor = armor;
        this.baseDamage = 5;
        this.maxHealth = health;// Initialize armor
    }

    // Getters
    public String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana; // Added getter for mana
    }

    public int getArmor() {
        return armor; // Added getter for armor
    }

    public PlayerType getType() {
        return type;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setMana(int mana) {
        this.mana = mana; // Added setter for mana
    }

    public void setArmor(int armor) {
        this.armor = armor; // Added setter for armor
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
    public int setHealthMax(){
        this.health = maxHealth;
        return health;
    }

    // Method to display player status
    public void displayStatus() {
        if (name == null) {
            System.out.println("Player name is not set.");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
        System.out.println("Mana: " + mana); // Added display for mana
        System.out.println("Armor: " + armor); // Added display for armor
        System.out.println("Class: " + type); // Displays player type

    }



    public boolean isAlive() {
        if (health <= 0) {
            return false;
        }
        return true;
    }
    public int attackBars() {
        health -= baseDamage;
        return health; // Return attack power as damage
    }

    public void takeDamage(int damage) {
    }
    public static void battleMechWarrior(int baseDamage){

        Enemy guard = new Enemy("Guard", 50, 10);
        System.out.println("You Attack!");

        while(Player.getHealth() > 0 || Enemy.getHealth() > 0){
           ;


        }
    }
}