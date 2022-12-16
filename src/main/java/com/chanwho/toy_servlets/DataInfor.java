package com.chanwho.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.chanwho.toy_servlets.bean.SurveyBean;

public class DataInfor {
    
    // question list 작성 : hashmap 받아옴
    public ArrayList<SurveyBean> getDataHashMapWithSurveyBeanQuestionList(){
        // 사용할 arraylist와 hashmap을 선언해줌
        ArrayList<SurveyBean> SurveyQuestionList = new ArrayList<>();
        HashMap<String,String> questionListData1 = new HashMap<>();
        HashMap<String,String> questionListData2 = new HashMap<>();
        HashMap<String,String> questionListData3 = new HashMap<>();
        HashMap<String,String> questionListData4 = new HashMap<>();
        HashMap<String,String> questionListData5 = new HashMap<>();


        SurveyBean surveyBean1 = new SurveyBean();
        questionListData1.put("question", "해당 매장을 방문시 매장은 청결 하였습니까?");
        questionListData1.put("questions_uid", "Q1");
        questionListData1.put("order", "1");
        surveyBean1.setQuestions_list(questionListData1);
        SurveyQuestionList.add(surveyBean1);

        SurveyBean surveyBean2 = new SurveyBean();
        questionListData2.put("question", "주문시 직원은 고객님께 친절 하였습니까?");
        questionListData2.put("questions_uid", "Q2");
        questionListData2.put("order", "2");
        surveyBean2.setQuestions_list(questionListData2);
        SurveyQuestionList.add(surveyBean2);

        SurveyBean surveyBean3 = new SurveyBean();
        questionListData3.put("question", "주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questionListData3.put("questions_uid", "Q5");
        questionListData3.put("order", "4");
        surveyBean3.setQuestions_list(questionListData3);
        SurveyQuestionList.add(surveyBean3);

        SurveyBean surveyBean4 = new SurveyBean();
        questionListData4.put("question", "해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        questionListData4.put("questions_uid", "Q1");
        questionListData4.put("order", "4");
        surveyBean4.setQuestions_list(questionListData4);
        SurveyQuestionList.add(surveyBean4);

        SurveyBean surveyBean5 = new SurveyBean();
        questionListData5.put("question", "직원이 제조한 음료에 대해 맛은 좋았습니까?");
        questionListData5.put("questions_uid", "Q4");
        questionListData5.put("order", "5");
        surveyBean5.setQuestions_list(questionListData5);
        SurveyQuestionList.add(surveyBean5);


        return SurveyQuestionList;
    }

    // answer list 작성 : hashmap 받아옴
    public ArrayList<SurveyBean> getDataHashMapWithSurveyBeanAnswerList(){



        return ;
    }
}
