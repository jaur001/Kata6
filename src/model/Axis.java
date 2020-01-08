package model;

public class Axis {
    private int minimumPos;
    private int maximumPos;
    private int initialPos;
    private int currentPos;

    public Axis(int minimumPos, int maximumPos) {
        this.minimumPos = minimumPos;
        this.maximumPos = maximumPos;
        this.initialPos = (minimumPos + maximumPos)/2;
        this.currentPos = initialPos;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public int getInitialPos() {
        return initialPos;
    }

    public int getMinimumPos() {
        return minimumPos;
    }

    public void setMinimumPos(int minimumPos) {
        this.minimumPos = minimumPos;
    }

    public int getMaximumPos() {
        return maximumPos;
    }

    public void setMaximumPos(int maximumPos) {
        this.maximumPos = maximumPos;
    }

    public int getSize(){
        return Math.abs(minimumPos)+Math.abs(maximumPos);
    }
}
