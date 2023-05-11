package web.dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public interface CarDao {
    public List <Car> getCarslist (int count);
}
