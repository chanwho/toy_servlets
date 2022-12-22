package com.chanwho.toy_servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


import com.chanwho.toy_servlets.dao.GetDBWithPoll;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Poll/DetailServlet")
public class DetailServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ORDERS = request.getParameter("ORDERS"); // 파라메터 받아옴
        

        // DB에서 데이터 받아옴
        GetDBWithPoll getDBWithPoll = new GetDBWithPoll();
        HashMap<String, Object> question = new HashMap<>();
        ArrayList<HashMap> example = new ArrayList<>();
        try {
            question = (HashMap<String, Object>) getDBWithPoll.getQuestion(ORDERS);
            example = (ArrayList<HashMap>) getDBWithPoll.getAnswer();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
        // DB manipulate
        HashMap<String, Object> example1 = (HashMap<String, Object>) example.get(0);
        HashMap<String, Object> example2 = (HashMap<String, Object>) example.get(1);
        HashMap<String, Object> example3 = (HashMap<String, Object>) example.get(2);
        HashMap<String, Object> example4 = (HashMap<String, Object>) example.get(3);
        HashMap<String, Object> example5 = (HashMap<String, Object>) example.get(4);
        
        //request에 Attribute 추가해줌
        request.setAttribute("question", question);
        request.setAttribute("example1", example1);
        request.setAttribute("example2", example2);
        request.setAttribute("example3", example3);
        request.setAttribute("example4", example4);
        request.setAttribute("example5", example5);
        

        // 정보를 유지하기 위해 requestDispatcher 사용
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/details.jsp");
        requestDispatcher.forward(request, response);
    }
}
