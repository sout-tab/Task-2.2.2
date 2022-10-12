package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Subaru", 1, 500000));
        cars.add(new Car("BMW", 2, 600000));
        cars.add(new Car("Mercedes", 3, 700000));
        cars.add(new Car("Audi", 4, 800000));
        cars.add(new Car("Porsche", 5, 900000));
    }
}
