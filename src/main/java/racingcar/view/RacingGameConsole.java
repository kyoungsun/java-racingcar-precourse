package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class RacingGameConsole {

    private static final String CAR_NAMES_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String GAME_ROUND_REQUEST_MESSAGE = "시도할 회수는 몇회인가요?";

    private static final String COLON = ":";
    private static final String POSITION_STRING = "-";

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

    public void printCurrentPosition(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(createCurrentPositionMessage(car));
        }
    }

    private String createCurrentPositionMessage(Car car) {
        StringBuffer sb = new StringBuffer(car.getName());
        sb.append(COLON);
        int position = car.getPosition();
        for (int i = 0; i < position; i++) {
            sb.append(POSITION_STRING);
        }
        return sb.toString();
    }
}
