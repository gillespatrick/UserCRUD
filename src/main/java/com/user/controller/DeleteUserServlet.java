/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.controller;

import com.user.dao.UserDAO;
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
@WebServlet(name = "deleteUser", urlPatterns = {"/deleteUser"})
public class DeleteUserServlet extends HttpServlet {
    
      private UserDAO userDAO;

    public DeleteUserServlet() {
        this.userDAO = new UserDAO();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try {
              deleteUser(request, response);
          } catch (SQLException ex) {
              Logger.getLogger(DeleteUserServlet.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
  
    
       private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        userDAO.deleteUser(id);
        response.sendRedirect("userList");

    }

}
