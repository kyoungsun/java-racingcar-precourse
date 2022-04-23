package racingcar.controller;

import racingcar.domain.CarNames;
import racingcar.domain.GameRound;
import racingcar.view.RacingGameConsole;

public class RacingGameController {

    private final RacingGameConsole console;

    public RacingGameController(RacingGameConsole console) {
        this.console = console;
    }

    public void playGame() {
        CarNames carNames = getCarNames();
        System.out.println(carNames);
        GameRound gameRound = getGameRound();
        System.out.println(gameRound.getValue());
    }

    private CarNames getCarNames() {
        try {
            return new CarNames(console.getCarNames());
        } catch (IllegalArgumentException e) {
            console.printErrorMessage(e);
            return getCarNames();
        }
    }

    private GameRound getGameRound() {
        try {
            return new GameRound(console.getGameRound());
        } catch (IllegalArgumentException e) {
            console.printErrorMessage(e);
            return getGameRound();
        }
    }

}
