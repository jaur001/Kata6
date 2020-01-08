package model;

public class Block {
    private int weight;
    private int height;
    private Axis axis;

    public Block(int weight, int height, Axis axis) {
        this.weight = weight;
        this.height = height;
        this.axis = axis;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Axis getAxis() {
        return axis;
    }

    public void setAxis(Axis axis) {
        this.axis = axis;
    }
}
