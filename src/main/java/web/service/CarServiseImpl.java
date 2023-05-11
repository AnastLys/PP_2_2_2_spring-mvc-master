package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;


@Service
public class CarServiseImpl implements CarService{
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCarslist (int count){
        return carDao.getCarslist(count);
    }
}
