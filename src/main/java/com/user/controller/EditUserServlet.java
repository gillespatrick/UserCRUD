/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.controller;

import com.user.dao.UserDAO;
import com.user.model.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "editUser", urlPatterns = {"/editUser"})
public class EditUserServlet extends HttpServlet {

    private UserDAO userDAO;

    public EditUserServlet() {
        this.userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        editUser(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            updateUser(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EditUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userDAO.selectById(id);
        request.setAttribute("user", user);
        this.getServletContext().getRequestDispatcher("/WEB-INF/editUser.jsp").forward(request, response);

    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("name");
        String country = request.getParameter("country");

        User user = new User(id, name, email, country);
        userDAO.updateUser(user);
        response.sendRedirect("userList");
    }

}
