package racingcar.domain;

public class Car {

    private static final int POSITION_INITIAL_VALUE = 0;
    private static final int MOVABLE_CONDITION = 4;

    private final CarName carName;
    private int position;


    public Car(final String name) {
        this.carName = new CarName(name);
        this.position = POSITION_INITIAL_VALUE;
    }

    public void moveForward() {
        this.position += 1;
    }

    public String getName() {
        return carName.getValue();
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
