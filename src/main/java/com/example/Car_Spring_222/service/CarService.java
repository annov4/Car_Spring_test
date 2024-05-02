package com.example.Car_Spring_222.service;

import com.example.Car_Spring_222.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}