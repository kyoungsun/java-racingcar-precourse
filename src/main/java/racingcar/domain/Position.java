package racingcar.domain;

import java.util.Objects;

public class Position {

    private static final int POSITION_INITIAL_VALUE = 0;

    private int value;

    public Position() {
        this(POSITION_INITIAL_VALUE);
    }

    public Position(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void moveForward() {
        this.value++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
