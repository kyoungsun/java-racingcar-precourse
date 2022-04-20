package racingcar.domain;

public class Car {

    private static final int NAME_LENGTH_MAX = 5;
    private static final int POSITION_INITIAL_VALUE = 0;
    private static final int MOVABLE_CONDITION = 4;


    private static final String NAME_LENGTH_ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    private final String name;
    private int position;

    public Car(final String name) {
        if (name.length() > NAME_LENGTH_MAX) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.name = name;
        this.position = POSITION_INITIAL_VALUE;
    }

    public void moveForward() {
        this.position += 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int condition) {
        if (isMovableCondition(condition)) {
            moveForward();
        }
    }

    private boolean isMovableCondition(int condition) {
        return condition >= MOVABLE_CONDITION;
    }
}
