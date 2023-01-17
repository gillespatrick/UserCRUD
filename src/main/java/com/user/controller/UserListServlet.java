/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.controller;

import com.user.dao.UserDAO;
import com.user.model.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gilles
 */
@WebServlet(name = "userList", urlPatterns = {"/userList"})
public class UserListServlet extends HttpServlet {
     private UserDAO userDAO;

    public UserListServlet() {
        this.userDAO = new UserDAO();
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       listUsers(request, response);
    }
    
  
     private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<User> users = userDAO.selectAll();
       request.setAttribute("users", users);
        this.getServletContext().getRequestDispatcher("/WEB-INF/userList.jsp").forward(request, response);
       
    }
}
