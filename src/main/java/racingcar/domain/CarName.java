package racingcar.domain;

import java.util.Objects;

public class CarName {

    private static final String NAME_LENGTH_ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    private static final int NAME_LENGTH_MAX = 5;

    private final String value;

    public CarName(String value) {
        if (value.length() > NAME_LENGTH_MAX) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(value, carName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
