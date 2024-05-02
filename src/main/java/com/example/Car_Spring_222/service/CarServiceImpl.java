package com.example.Car_Spring_222.service;

import com.example.Car_Spring_222.dao.CarDao;
import com.example.Car_Spring_222.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    @Value("${max.car}")
    private int maxCar;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > maxCar) {
            return carDao.getCars();
        }
        List<Car> cars = carDao.getCars();
        if (count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
