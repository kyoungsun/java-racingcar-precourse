package racingcar.controller;

import racingcar.domain.CarName;
import racingcar.view.RacingGameConsole;

import java.util.ArrayList;
import java.util.List;

import static racingcar.domain.ErrorMessage.CAR_NAME_DELIMITER_ERROR_MESSAGE;

public class RacingGameController {

    private static final String CAR_NAME_DELIMITER = ",";

    private final RacingGameConsole console;

    public RacingGameController(RacingGameConsole console) {
        this.console = console;
    }

    public void playGame() {
        List<CarName> carNames = getCarNames();
        System.out.println(carNames);
    }    

    private List<CarName> getCarNames() {
        try {
            String names = console.getCarNames();
            return parseCarNames(names);
        } catch (IllegalArgumentException e) {
            console.printErrorMessage(e);
            return getCarNames();
        }
    }    

    private List<CarName> parseCarNames(String names) {
        validateCarNamesDelimiter(names);
        List<CarName> carNames  = new ArrayList<>();
        String[] split = names.split(CAR_NAME_DELIMITER);
        for (String name : split) {
            carNames.add(new CarName(name));
        }
        return carNames;
    }

    private void validateCarNamesDelimiter(String carNames) {
        if (!carNames.contains(CAR_NAME_DELIMITER)) {
            throw new IllegalArgumentException(CAR_NAME_DELIMITER_ERROR_MESSAGE);
        }
    }

}
