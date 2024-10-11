public class Combat {
    public static void performAttack(Player player, Enemy enemy) {
        if (player.isAlive() && enemy.isAlive()) {
            // Player attacks
            int damage = player.attack();
            enemy.takeDamage(damage);
            System.out.println(player.getName() + " attacks " + enemy.getName() + " for " + damage + " damage!");
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left.");

            // Check if enemy is dead
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " has been defeated!");
            } else {
                // Enemy attacks back
                damage = enemy.attack();
                player.takeDamage(damage);
                System.out.println(enemy.getName() + " attacks " + player.getName() + " for " + damage + " damage!");
                System.out.println(player.getName() + " has " + player.getHealth() + " health left.");

                // Check if player is dead
                if (!player.isAlive()) {
                    System.out.println(player.getName() + " has been defeated!");
                }
            }
        }
    }
}
