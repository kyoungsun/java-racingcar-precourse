package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomConditionGeneratorTest {

    @Test
    void 하나의_컨디션을_생성() {
        RandomConditionGenerator generator = new RandomConditionGenerator();
        Condition condition = generator.generate();
        assertThat(condition.getValue()).isBetween(Condition.MIN_VALUE, Condition.MAX_VALUE);
    }

    @Test
    void 여러개의_컨디션을_생성() {
        RandomConditionGenerator generator = new RandomConditionGenerator();
        int count = 3;
        List<Condition> conditions = generator.generate(count);
        assertThat(conditions.size()).isEqualTo(count);
    }
}