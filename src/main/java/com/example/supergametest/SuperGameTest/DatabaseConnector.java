package com.example.supergametest.SuperGameTest;

import java.sql.*;

public class DatabaseConnector {
    private final String connectionUrl;
    private final Connection connection;

    public DatabaseConnector() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/supergametest";
        try {
            this.connection = DriverManager.getConnection(connectionUrl, "root", "Ja.Rz.321!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet insert() {

    }

    public ResultSet queryWithReturn(String query) {
        try {
            System.out.println("Execute: " + query);
            PreparedStatement ps = connection.prepareStatement(query);

            return ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void queryWithoutReturn(String query) {
        try {
            System.out.println("Execute: " + query);
            PreparedStatement ps = connection.prepareStatement(query);

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
