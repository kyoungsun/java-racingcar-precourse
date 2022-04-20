package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private static final String ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    @Test
    void 자동차_이름을_5자리까지_허용() {
        String name = "kks91";
        Car car = new Car(name);
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    void 자동차_이름을_6자리_이상_입력하면_오류_발생() {
        assertThatThrownBy(() -> new Car("kyoung1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_MESSAGE);
    }

    @Test
    void 자동차_전진하기() {
        Car car = new Car("kks");
        car.moveForward();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "3,0", "4,1", "9,1"})
    void 숫자가_4_이상일_때만_전진_(int condition, int position) {
        Car car = new Car("kks");
        car.move(condition);
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
