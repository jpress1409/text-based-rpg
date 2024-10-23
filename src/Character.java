public class Character {
    private String name;
    int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0; // Prevent negative health
    }

    public int attack() {
        return attackPower; // Return attack power as damage
    }

    public boolean isAlive() {
        if (health > 0)
        {return true;}
        else {
            return false;
        }
    }
}