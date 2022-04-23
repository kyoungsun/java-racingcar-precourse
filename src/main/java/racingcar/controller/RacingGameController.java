package racingcar.controller;

import racingcar.view.RacingGameConsole;

import java.util.List;

public class RacingGameController {

    private final RacingGameConsole console;

    public RacingGameController(RacingGameConsole console) {
        this.console = console;
    }

    public void playGame() {
        List<String> carNames = getCarNames();
        System.out.println(carNames);
    }

    private List<String> getCarNames() {
        try {
            return console.getCarNames();
        } catch (IllegalArgumentException e) {
            console.printErrorMessage(e);
            return getCarNames();
        }
    }
}
