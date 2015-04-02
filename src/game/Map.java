package game;

public class Map {
    private int mapSizeX;
    private int mapSizeY;

    public Map(int x, int y) {
        mapSizeX = x;
        mapSizeY = y;

    }

    private Cell[][] createMap(int x, int y) {


        return new Cell[x][y];

    }

    public Cell[][] getMaze() {
        return createMap(mapSizeX, mapSizeY);

    }

}
