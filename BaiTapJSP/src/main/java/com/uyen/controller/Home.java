package com.uyen.controller;
import Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "home", urlPatterns = "/home")
public class Home extends HttpServlet{
    List<Product> productList = new ArrayList<Product>();

    @Override
    public void init() throws ServletException {
        Product product = new Product("Dien thoai Nokia", 20, 5000000);
        productList.add(product);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("webapp/Home.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        int price = Integer.parseInt(req.getParameter("price"));
        Product product = new Product(name, quantity, price);
        productList.add(product);
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("webapp/Product.jsp").forward(req, resp);
    }
}
