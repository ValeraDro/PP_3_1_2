package web.controller;

import Service.CarService;
import Service.CarServiceImpl;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarsController {
    @GetMapping("/cars")
    public String listCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        CarService cars = new CarServiceImpl();
        cars.add(new Car(1996, "crv", 250000));
        cars.add(new Car(2001, "vitz", 180000));
        cars.add(new Car(1996, "terrano", 420000));
        cars.add(new Car(2012, "lada", 300000));
        cars.add(new Car(2008, "cx7", 700000));
        model.addAttribute("cars", cars.listCars(count));
        return "cars";
    }
}
