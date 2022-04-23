package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.view.RacingGameConsole;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RacingGameConsole console = new RacingGameConsole();
        RacingGameController controller = new RacingGameController(console);
        controller.playGame();
    }
}
