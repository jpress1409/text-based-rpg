public class Location {
    private String description;
    private Map map;


    public Location(String description) {
        this.description = description;

    }

    public void display() {
        System.out.println(description);
    }

    // Add methods to add items and NPCs, and to get descriptions
}

