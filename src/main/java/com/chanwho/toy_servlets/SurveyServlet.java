package com.chanwho.toy_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.chanwho.toy_servlets.bean.SurveyBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollListSurvlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DataInfor dataInfor = new DataInfor();
        HashMap<String,Object> surveyData = dataInfor.getBundleData();
        
        ArrayList<Object> questionArrayList = (ArrayList<Object>) surveyData.get("question_list");
        ArrayList<Object> AnswerArrayList = (ArrayList<Object>) surveyData.get("answer_list");
        ArrayList<Object> question_AnswerArrayList = (ArrayList<Object>) surveyData.get("question_Answer");
        
        HashMap<String, String> Q_list = new HashMap<>();
        HashMap<String, String> A_list = new HashMap<>();
        ArrayList<Object> QA_list = new ArrayList<>();
        
        // list로 만들기
        
        for (int i = 0; i<questionArrayList.size(); i++){
            SurveyBean surveyBean = (SurveyBean) questionArrayList.get(i);
            Q_list.put(surveyBean.getQuestions_list().get("questions_uid"),surveyBean.getQuestions_list().get("question"));
        }
        for (int i = 0; i<AnswerArrayList.size(); i++){
            SurveyBean surveyBean = (SurveyBean) AnswerArrayList.get(i);
            A_list.put(surveyBean.getAnswer_list().get("answer_uid"),surveyBean.getAnswer_list().get("answer"));
        }
        
        String temp = "Q0";
        ArrayList<String> tempArrayList = new ArrayList<>();
        for (int i = 0; i<question_AnswerArrayList.size(); i++){
            SurveyBean surveyBean = (SurveyBean) question_AnswerArrayList.get(i);
            String comp = surveyBean.getQuestions_answers().get("questions_uid");
            if (temp.equals(comp)){ //questions_uid가 같을때
                tempArrayList.add(surveyBean.getQuestions_answers().get("answer_uid"));
            } else{ //questions_uid가 다를때
                if (!temp.equals("Q0")){
                    QA_list.add(tempArrayList.clone());
                }
                tempArrayList.clear();
                tempArrayList.add(surveyBean.getQuestions_answers().get("questions_uid"));
                tempArrayList.add(surveyBean.getQuestions_answers().get("answer_uid"));
                temp = surveyBean.getQuestions_answers().get("questions_uid");
            }
        }
        QA_list.add(tempArrayList.clone());
        // html 부분
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html lang='en'>");
        
        printWriter.println("<head>");
        printWriter.println("<link");
        printWriter.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
        printWriter.println("rel='stylesheet'");
        printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
        printWriter.println("crossorigin='anonymous'");
        printWriter.println("/>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div>");
        printWriter.println("이름 : 이찬우");
        printWriter.println("</div>");
        printWriter.println("<div>");
        printWriter.println("소속 : kh academy");
        printWriter.println("</div>");

        for(int i = 0; i<QA_list.size(); i++){
            ArrayList<String> printQA = (ArrayList<String>) QA_list.get(i);
            printWriter.println("<div>");
            printWriter.println((i+1)+". ");
            printWriter.println(Q_list.get(printQA.get(0)));
            printWriter.println("</div>");
            printWriter.println("<div>");
            printWriter.println("</div>");
            printWriter.println("<div>");
            for (int j = 1; j<printQA.size(); j++){
                printWriter.println("("+j+")");
                printWriter.println(A_list.get(printQA.get(j)));
            }
            printWriter.println("</div>");
        }
        printWriter.println("<script");
        printWriter.println("src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'");
        printWriter.println("></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
        
    }
    
}
