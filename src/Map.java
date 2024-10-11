public class Map {
    private char[][] grid; // Use char for different terrain types or locations

    public Map(int width, int height) {
        grid = new char[height][width];
    }

    public void setTile(int x, int y, char tile) {
        grid[y][x] = tile;
    }

    public char getTile(int x, int y) {
        return grid[y][x];
    }

    public void displayMap() {
        for (char[] row : grid) {
            System.out.println(row);
        }
    }
}

