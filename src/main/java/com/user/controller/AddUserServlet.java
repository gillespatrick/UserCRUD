/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.controller;

import com.user.dao.UserDAO;
import com.user.model.User;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gilles
 */
@WebServlet(name = "addUser", urlPatterns = {"/addUser"})
public class AddUserServlet extends HttpServlet {

    private UserDAO userDAO;

    public AddUserServlet() {
        this.userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/addUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            insertUser(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("name");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        userDAO.insertUser(user);
        response.sendRedirect("userList");

    }

 

  

    
    
    
   
}
