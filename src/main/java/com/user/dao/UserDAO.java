/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.dao;

import com.user.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilles
 */
public class UserDAO {

    private String url = "jdbc:mariadb://localhost:3306/userCRUD?useSSL =false";
    private String user = "root";
    private String password = "root";

    private static final String insert = "insert into users (name,email,country) values (?,?,?);";
    private static final String selectById = "select * from users where id=?;";
    private static final String selectAll = "select * from users;";
    private static final String delete = "delete from users where id =?;";
    private static final String update = "update users set name=?,email=?, country=? where id=?;";

    protected Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Create user
    public void insertUser(User user) throws SQLException {
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update User
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdate = false;
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(update);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());
            rowUpdate = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    // Select user by Id
    public User selectById(int id) {
        User user = null;

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectById);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);

            }
        } catch (SQLException e) {
        }
        return user;
    }

    //Select All the users
    public List<User> selectAll() {
        List<User> users = new ArrayList<>();

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectAll);
            // preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                users.add(new User(id, name, email, country));

            }
        } catch (SQLException e) {
        }
        return users;
    }

    // Delete user
    public  boolean deleteUser(int id) throws SQLException{
        boolean rowDelete = false;
        
         try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
             preparedStatement.setInt(1, id);
             rowDelete = preparedStatement.executeUpdate() > 0;
             
        } catch (SQLException e) {
        }
        return rowDelete;
        
    }
}
