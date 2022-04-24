package racingcar.controller;

import racingcar.domain.CarNames;
import racingcar.domain.Cars;
import racingcar.domain.GameRound;
import racingcar.domain.RandomConditionGenerator;
import racingcar.view.RacingGameConsole;

public class RacingGameController {

    private final RacingGameConsole console;
    private final RandomConditionGenerator generator;

    public RacingGameController(RacingGameConsole console, RandomConditionGenerator generator) {
        this.console = console;
        this.generator = generator;
    }

    public void playGame() {
        Cars cars = Cars.of(getCarNames());
        GameRound gameRound = getGameRound();
        for (int i = 0; i < gameRound.getValue(); i++) {
            cars.move(generator);
            console.printCurrentPosition(cars);
        }
        Cars winners = cars.getWinners();
        console.printWinners(winners);
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
