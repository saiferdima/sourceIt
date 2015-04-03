package game;

public class Map {
    private int mapSizeX;
    private int mapSizeY;

    public Map() {
        mapSizeX = 5;
        mapSizeY = 5;

    }

    public Map(int x, int y) {
        mapSizeX = x;
        mapSizeY = y;

    }

    private Cell[][] createMap() {
        Cell[][] cell = new Cell[this.mapSizeX][this.mapSizeY];

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                cell[i][j] = new Cell();
            }
        }
        return cell;

    }

    public void displayAllCellInfo(Cell cell[][]) {
        Messenger mes = new Messenger();
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                mes.showMessage("Cell[" + i + "][" + j + "]");
                mes.showMessage(cell[i][j].getAllCells());
            }
        }


    }


    public Cell[][] getMaze() {
        return createMap();

    }

}
