package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_전진하기() {
        Car car = new Car("kks");
        car.moveForward();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_두_번_전진하기() {
        Car car = new Car("kks");
        car.moveForward();
        car.moveForward();
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "3,0", "4,1", "9,1"})
    void 숫자가_4_이상일_때만_전진(int condition, int position) {
        Car car = new Car("kks");
        car.move(new Condition(condition));
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
