package com.uyen.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.uyen.controller.Homepage;

@WebServlet(name = "controller", urlPatterns = "/controller")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int minPlayer = 0;
        int minNumberOfTurn = 0;
        Player min = Homepage.playerList.get(0);
        for (int i = 1; i < Homepage.playerList.size(); i++) {
            System.out.println(Homepage.playerList.get(i).getNumberOfTurn());
            if (Homepage.playerList.get(i).getNumberOfTurn() < min.getNumberOfTurn()) {
                min = Homepage.playerList.get(i);
                minPlayer = i;
                minNumberOfTurn = Homepage.playerList.get(i).getNumberOfTurn();
            }
        }
        req.setAttribute("minPlayer", minPlayer);
        req.setAttribute("minNumberOfTurn", minNumberOfTurn);
        System.out.println(minPlayer+ "--"+minNumberOfTurn);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    protected void doGetEndGame(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Homepage.playerList = new ArrayList<Player>();
        Homepage.playerIndex = -1;
        resp.sendRedirect("/game/homepage");
    }
}
