package com.uyen.controller;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "homepage", urlPatterns = {"/homepage"})
public class Homepage extends HttpServlet {

    //Player player = null;
    public static List <Player> playerList;
    public static int playerIndex = -1;
    public static int randomNumber = 0;

    @Override
    public void init() throws ServletException {
        System.out.println(1);
        playerList = new ArrayList<Player>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/gameUI.jsp").forward(req, resp);
        Player player = new Player();
        playerList.add(player);
        playerIndex++;
        randomNumber = player.getRandomNumber();
        System.out.println("so random: " + randomNumber);
        //this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        int num = Integer.parseInt(number);
        req.setAttribute("random",randomNumber);
        int count = playerList.get(playerIndex).getNumberOfTurn();
        String message = " ";
        if (num > randomNumber) {
            message = "So ban nhap dang lon lon";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/gameUI.jsp").forward(req, resp);
            //resp.sendRedirect("/game/controller");
            count++;
            System.out.println(message);
        } else if(num < randomNumber) {
            message = "so ban nhap dang nho hon";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/gameUI.jsp").forward(req, resp);
            //resp.sendRedirect("/game/controller");
            count++;
            System.out.println(message);
        }else {
            message = "Ban da doan dung";
            req.setAttribute("message", message);
            //resp.sendRedirect("/game/controller");
            count++;
            req.getRequestDispatcher("/endGame.jsp").forward(req, resp);
        }
        playerList.get(playerIndex).setNumberOfTurn(count);
        //System.out.println("input cus: " + num + "--" + "ramdom: " + randomNumber);

    }
}
