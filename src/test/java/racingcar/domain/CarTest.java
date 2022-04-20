package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 자동차_이름을_6자리_이상_입력하면_오류_발생() {
        assertThatThrownBy(() -> new Car("kyoung1"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
