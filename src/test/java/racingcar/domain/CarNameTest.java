package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    private static final String ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    @Test
    void 자동차_이름을_5자리까지_허용() {
        String value = "kks91";
        assertThat(new CarName(value)).isEqualTo(new CarName(value));
    }

    @Test
    void 자동차_이름을_6자리_이상_입력하면_오류_발생() {
        assertThatThrownBy(() -> new CarName("kyoung1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_MESSAGE);
    }
}