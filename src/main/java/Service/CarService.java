package Service;

import model.Car;

import java.util.List;

public interface CarService {
    void add(Car car);

    List<Car> listCars(int count);
}
