package org.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepo {

    private final Connection customerConnection;

    public CustomerRepo() throws ClassNotFoundException {
        this.customerConnection = ConnectionSingleton.getConnectionSingleton("schema");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CustomerRepo customerRepo = new CustomerRepo();
        String query = "SELECT * FROM people";
        PreparedStatement st = customerRepo.customerConnection.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        while (rs.next()) System.out.println(rs.getString(1));

    }
}
