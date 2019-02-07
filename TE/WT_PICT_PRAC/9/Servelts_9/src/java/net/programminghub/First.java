/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.programminghub;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author root
 */
public class First extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet First</title>");            
            out.println("</head>");
            out.println("<body><center>");
            out.println("<h1>Product Details</h1>");
            
            
            String productId=request.getParameter("productId");
            String productName=request.getParameter("pname");
            String productCategory=request.getParameter("category");
            String productPrice=request.getParameter("price");
            String productQuantity=request.getParameter("quantity");
            String productDescription=request.getParameter("description");
            out.println("<table width=\"50%\">"
                    + "<tr><th>Product Id</th><td>"+productId+"</td></tr>"
                    + "<tr><th>Product Name</th><td>"+productName+"</td></tr>"
                    + "<tr><th>Product Category</th><td>"+productCategory+"</td></tr>"
                    + "<tr><th>Price/Item</th><td>"+productPrice+"</td></tr>"
                    + "<tr><th>Quantity</th><td>"+productQuantity+"</td></tr>"
                    + "<tr><th>Description</th><td>"+productDescription+"</td></tr>"
                    + "</table>");
            
            HttpSession session=request.getSession();
            session.setAttribute("productId", productId);
            
            RequestDispatcher rd= request.getRequestDispatcher("Second");
            /*
            Reference==> https://www.javatpoint.com/requestdispatcher-in-servlet
            */
            //INClude method will include response of Second Servlet Into First Sevlet
            rd.include(request,response);
            
            //THIS method will forward request to Second.java Servlet
            //rd.forward(request,response);
            
            
            
            
            out.println("</center></body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
