package game;


public class Cell {


    private boolean leftBorder;
    private boolean rightBorder;
    private boolean topBorder;
    private boolean bottomBorder;


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
}
