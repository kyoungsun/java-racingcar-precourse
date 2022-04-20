package racingcar.domain;

public class Car {

    private static final int NAME_LENGTH_MAX = 5;

    private static final String NAME_LENGTH_ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    private final String name;

    public Car(final String name) {
        if (name.length() > NAME_LENGTH_MAX) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.name = name;
    }
}
