package com.rajesh.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDataBase {

    private final ConnectionProvider provider;

    public CarDataBase(ConnectionProvider provider) {
        this.provider = provider;
    }

    public int save(Car c) throws SQLException {

        String sql = "insert into car(carName, carNumber, carModel, carCompany) VALUES (?, ?, ?, ?)";

        try (Connection con = provider.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, c.getCarName());
            pstmt.setString(2, c.getCarNumber());
            pstmt.setString(3, c.getCarModel());
            pstmt.setString(4, c.getCarCompany());

            return pstmt.executeUpdate();
        }
    }
}