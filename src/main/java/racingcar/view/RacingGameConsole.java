package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static racingcar.domain.ErrorMessage.CAR_NAME_DELIMITER_ERROR_MESSAGE;

public class RacingGameConsole {

    private static final String CAR_NAMES_REQUEST_MESSAGE = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";
    private static final String CAR_NAME_DELIMITER = ",";

    public List<String> getCarNames() {
        System.out.println(CAR_NAMES_REQUEST_MESSAGE);
        return split(Console.readLine());
    }

    private List<String> split(String line) {
        validateLine(line);
        String[] split = line.split(CAR_NAME_DELIMITER);
        return Arrays.asList(split);
    }

    private void validateLine(String line) {
        if (!line.contains(CAR_NAME_DELIMITER)) {
            throw new IllegalArgumentException(CAR_NAME_DELIMITER_ERROR_MESSAGE);
        }
    }

    public void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

}
