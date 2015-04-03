package game;


import java.util.Random;

public class Cell {


    private boolean leftBorder;
    private boolean rightBorder;
    private boolean topBorder;
    private boolean bottomBorder;

    public Cell() {
        Random random = new Random();
        leftBorder = random.nextBoolean();
        rightBorder = random.nextBoolean();
        topBorder = random.nextBoolean();
        bottomBorder = random.nextBoolean();

    }


    public void setLeftBorder(boolean leftBorder) {
        this.leftBorder = leftBorder;
    }

    public void setRightBorder(boolean rightBorder) {
        this.rightBorder = rightBorder;
    }

    public void setTopBorder(boolean topBorder) {
        this.topBorder = topBorder;
    }

    public void setBottomBorder(boolean bottomBorder) {
        this.bottomBorder = bottomBorder;
    }

    public boolean isLeftBorder() {
        return leftBorder;
    }

    public boolean isRightBorder() {
        return rightBorder;
    }

    public boolean isTopBorder() {
        return topBorder;
    }

    public boolean isBottomBorder() {
        return bottomBorder;
    }

    public String getAllCells() {
        String cellBorders = "";
        return cellBorders + "leftBorder = " + leftBorder + "\nrightBorder = " + rightBorder + "\ntopBorder = " + topBorder + "\nbottomBorder = " + bottomBorder + "\n";
    }


}
