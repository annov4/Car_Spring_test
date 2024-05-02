package com.example.Car_Spring_222.dao;


import com.example.Car_Spring_222.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer count);
    List<Car> getCars();
}