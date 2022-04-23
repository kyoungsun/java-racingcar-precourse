package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomConditionGenerator {

    public List<Condition> generate(int count) {
        List<Condition> conditions = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            conditions.add(generate());
        }
        return conditions;
    }

    public Condition generate() {
        return new Condition(Randoms.pickNumberInRange(Condition.MIN_VALUE, Condition.MAX_VALUE));
    }

}
