package racingcar.domain;

public class Position {

    private static final int POSITION_INITIAL_VALUE = 0;

    private int value;

    public Position() {
        this.value = POSITION_INITIAL_VALUE;
    }

    public int getValue() {
        return value;
    }

    public void moveForward() {
        this.value++;
    }
}
