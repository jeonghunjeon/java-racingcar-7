package racingcar;

import racingcar.controller.RaceController;
import racingcar.domain.RequestRaceDto;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RaceController raceController = new RaceController();

        raceController.parseInput();
        raceController.play();
        raceController.declareWinners();
    }
}
