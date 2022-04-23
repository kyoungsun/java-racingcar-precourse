package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class RacingGameConsole {

    private static final String CAR_NAMES_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GAME_ROUND_REQUEST_MESSAGE = "시도할 회수는 몇회인가요?";

    public String getCarNames() {
        System.out.println(CAR_NAMES_REQUEST_MESSAGE);
        return Console.readLine();
    }

    public String getGameRound() {
        System.out.println(GAME_ROUND_REQUEST_MESSAGE);
        return Console.readLine();
    }

    public void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

}
