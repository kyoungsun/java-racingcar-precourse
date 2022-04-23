package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class RacingGameConsole {

    private static final String CAR_NAMES_REQUEST_MESSAGE = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";

    public String getCarNames() {
        System.out.println(CAR_NAMES_REQUEST_MESSAGE);
        return Console.readLine();
    }

    public void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

}
