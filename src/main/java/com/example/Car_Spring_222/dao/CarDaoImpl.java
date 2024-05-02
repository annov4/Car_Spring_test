package com.example.Car_Spring_222.dao;

import com.example.Car_Spring_222.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "XM", 2023));
        carList.add(new Car("Toyota", "Corolla", 2000));
        carList.add(new Car("BMW", "F10", 2020));
        carList.add(new Car("Ford", "Focus", 2013));
        carList.add(new Car("AUDI", "A6", 2014));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return new ArrayList<>(carList);
    }

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(carList);
    }
}

