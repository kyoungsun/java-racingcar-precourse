package racingcar.domain;

public class Car {

    private static final int MOVABLE_CONDITION = 4;

    private final CarName carName;
    private final Position position;

    public Car(final String name) {
        this.carName = new CarName(name);
        this.position = new Position();
    }

    public void moveForward() {
        this.position.moveForward();
    }

    public String getName() {
        return carName.getValue();
    }

    public int getPosition() {
        return position.getValue();
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
