package utils;

public class Value {
    private int max;
    private int min;

    public Value() {
    }

    public Value(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "max=" + max + ", min=" + min;
    }
}
