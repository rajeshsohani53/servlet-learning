package com.rajesh.car;

import jakarta.servlet.http.HttpServletRequest;

public class CarMapper {

    public static Car getCar(HttpServletRequest request) {

        Car car = new Car();

        car.setCarName(request.getParameter("carName"));
        car.setCarNumber(request.getParameter("carNumber"));
        car.setCarModel(request.getParameter("carModel"));
        car.setCarCompany(request.getParameter("carCompany"));

        return car;
    }
}