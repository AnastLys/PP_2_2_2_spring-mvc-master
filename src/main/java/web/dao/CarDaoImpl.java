package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> cars = new ArrayList<Car>();

    static {
        cars.add(new Car("Model1","Brand1","Color1"));
        cars.add(new Car("Model2","Brand2","Color2"));
        cars.add(new Car("Model3","Brand3","Color3"));
        cars.add(new Car("Model4","Brand4","Color4"));
        cars.add(new Car("Model5","Brand5","Color5"));
    }
    @Override
    public List <Car> getCarslist (int count){
        return (count >= 5) ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
