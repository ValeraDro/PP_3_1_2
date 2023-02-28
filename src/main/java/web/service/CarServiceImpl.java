package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(1996, "crv", 250000));
        cars.add(new Car(2001, "vitz", 180000));
        cars.add(new Car(1996, "terrano", 420000));
        cars.add(new Car(2012, "lada", 300000));
        cars.add(new Car(2008, "cx7", 700000));
    }

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
