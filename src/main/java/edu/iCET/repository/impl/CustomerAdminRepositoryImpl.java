package edu.iCET.repository.impl;

import edu.iCET.db.DBConnection;
import edu.iCET.model.entity.CustomerAdmin;
import edu.iCET.repository.CustomerAdminRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class CustomerAdminRepositoryImpl implements CustomerAdminRepository {


    @Override
    public String getLastCustomerId() {
        String sql = "SELECT customerId FROM customeradmin ORDER BY customerId DESC LIMIT 1";

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()){
                return rs.getString(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public boolean save(CustomerAdmin customerAdmin) {
        String sql = "INSERT INTO customeradmin VALUES (?,?,?,?,?)";

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, customerAdmin.getCustomerId());
            preparedStatement.setString(2, customerAdmin.getTitle());
            preparedStatement.setString(3, customerAdmin.getName());
            preparedStatement.setString(4, customerAdmin.getPhone());
            preparedStatement.setString(5, customerAdmin.getEmail());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
