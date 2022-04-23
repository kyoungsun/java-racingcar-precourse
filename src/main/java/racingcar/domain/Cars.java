package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(CarNames carNames) {
        List<Car> cars = new ArrayList<>();
        for (CarName carName : carNames.getCarNames()) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }

    public void move(RandomConditionGenerator generator) {
        for (Car car : cars) {
            car.move(generator.generate());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
