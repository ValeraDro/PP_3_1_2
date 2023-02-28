package Service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.subList(0,
                (count > cars.size()) ? cars.size() : count);
    }
}
