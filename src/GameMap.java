public class GameMap {
    private Location[][] locations;
    private int y = 0;
    private int x = 0;

    public GameMap(int width, int height) {
        locations = new Location[height][width];
    }

    public void addLocation(int x, int y, Location location) {
        locations[y][x] = location;
    }

    public Location getLocation(int x, int y) {
        return locations[y][x];
    }


    public int getWidth() {
    return x;
    }

    public int getHeight() {
    return y;
    }
}

