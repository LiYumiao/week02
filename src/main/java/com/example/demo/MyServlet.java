package com.example.demo;

import       javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MyServlet", value = "/SelectBeer.do")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");
        //out.println("<br>Got beer color " + c);

        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        request.setAttribute("styles",result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}
