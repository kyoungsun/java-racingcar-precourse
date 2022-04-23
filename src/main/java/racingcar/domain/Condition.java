package racingcar.domain;

public class Condition {

    private static final int MOVABLE_CONDITION = 4;

    private final int value;

    public Condition(int value) {
        this.value = value;
    }

    public boolean isMovableCondition() {
        return value >= MOVABLE_CONDITION;
    }
}
