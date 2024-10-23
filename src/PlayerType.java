import java.util.Scanner;

// Enum for Player Types
public enum PlayerType {
    WARRIOR(200, 100, 0, 100),
    MAGE(100, 100, 200, 0),
    ROUGE(150, 150, 50, 50);

    private final int health;
    private final int stamina;
    private final int mana;
    private final int armorRating;
    private final int maxHealth;
    private final int evasivness;


    PlayerType(int health, int stamina, int mana, int armorRating) {
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.armorRating = armorRating;
        this.maxHealth = health;
        this.evasivness = 10;

    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana;
    }

    public int getArmorRating() {
        return armorRating;
    }
}
