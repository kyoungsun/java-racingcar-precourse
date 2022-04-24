package racingcar.domain;

import java.util.List;

public class Car {

    private final CarName carName;
    private final Position position;

    public Car(final String name) {
        this.carName = new CarName(name);
        this.position = new Position();
    }

    public Car(final CarName carName) {
        this.carName = carName;
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

    public void move(Condition condition) {
        if (condition.isMovableCondition()) {
            moveForward();
        }
    }

    public void checkPositionForWinners(int maxPosition, List<Car> winners) {
        if (this.position.equals(new Position(maxPosition))) {
            winners.add(this);
        }
    }
}
