package com.chanwho.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.chanwho.toy_servlets.bean.SurveyBean;

public class DataInfor {
    public HashMap<String,Object> getBundleData(){
        HashMap<String,Object> surveyBundleData = new HashMap<>();
        DataInfor dataInfor = new DataInfor();

        surveyBundleData.put("question_list",dataInfor.getDataHashMapWithSurveyBeanQuestionList());
        surveyBundleData.put("answer_list",dataInfor.getDataHashMapWithSurveyBeanAnswerList());
        surveyBundleData.put("question_Answer",dataInfor.getDataHashMapWithSurvdyBeanQuestionAnswer());

        return surveyBundleData;
    }


    // question list 작성 : hashmap 받아옴
    public ArrayList<SurveyBean> getDataHashMapWithSurveyBeanQuestionList(){
        // 사용할 arraylist와 hashmap을 선언해줌
        ArrayList<SurveyBean> SurveyQuestionList = new ArrayList<>();
        HashMap<String,String> questionListData1 = new HashMap<>();
        HashMap<String,String> questionListData2 = new HashMap<>();
        HashMap<String,String> questionListData3 = new HashMap<>();
        HashMap<String,String> questionListData4 = new HashMap<>();
        HashMap<String,String> questionListData5 = new HashMap<>();


        SurveyBean surveyBeanQ1 = new SurveyBean();
        questionListData1.put("question", "해당 매장을 방문시 매장은 청결 하였습니까?");
        questionListData1.put("questions_uid", "Q1");
        questionListData1.put("order", "1");
        surveyBeanQ1.setQuestions_list(questionListData1);
        SurveyQuestionList.add(surveyBeanQ1);

        SurveyBean surveyBeanQ2 = new SurveyBean();
        questionListData2.put("question", "주문시 직원은 고객님께 친절 하였습니까?");
        questionListData2.put("questions_uid", "Q2");
        questionListData2.put("order", "2");
        surveyBeanQ2.setQuestions_list(questionListData2);
        SurveyQuestionList.add(surveyBeanQ2);

        SurveyBean surveyBeanQ3 = new SurveyBean();
        questionListData3.put("question", "주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questionListData3.put("questions_uid", "Q3");
        questionListData3.put("order", "4");
        surveyBeanQ3.setQuestions_list(questionListData3);
        SurveyQuestionList.add(surveyBeanQ3);

        SurveyBean surveyBeanQ4 = new SurveyBean();
        questionListData4.put("question", "해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        questionListData4.put("questions_uid", "Q5");
        questionListData4.put("order", "4");
        surveyBeanQ4.setQuestions_list(questionListData4);
        SurveyQuestionList.add(surveyBeanQ4);

        SurveyBean surveyBeanQ5 = new SurveyBean();
        questionListData5.put("question", "직원이 제조한 음료에 대해 맛은 좋았습니까?");
        questionListData5.put("questions_uid", "Q4");
        questionListData5.put("order", "5");
        surveyBeanQ5.setQuestions_list(questionListData5);
        SurveyQuestionList.add(surveyBeanQ5);


        return SurveyQuestionList;
    }

    // answer list 작성 : hashmap 받아옴
    public ArrayList<SurveyBean> getDataHashMapWithSurveyBeanAnswerList(){
        ArrayList<SurveyBean> surveyAnswerList = new ArrayList<>();
        HashMap<String,String> AnswserListData1 = new HashMap<>();
        HashMap<String,String> AnswserListData2 = new HashMap<>();
        HashMap<String,String> AnswserListData3 = new HashMap<>();
        HashMap<String,String> AnswserListData4 = new HashMap<>();
        HashMap<String,String> AnswserListData5 = new HashMap<>();

        
        SurveyBean surveyBeanA1 = new SurveyBean();
        AnswserListData1.put("answer", "전혀 아니다");
        AnswserListData1.put("answer_uid", "E1");
        AnswserListData1.put("order", "1");
        surveyBeanA1.setAnswer_list(AnswserListData1);
        surveyAnswerList.add(surveyBeanA1);
        
        SurveyBean surveyBeanA2 = new SurveyBean();
        AnswserListData2.put("answer", "아니다");
        AnswserListData2.put("answer_uid", "E2");
        AnswserListData2.put("order", "2");
        surveyBeanA2.setAnswer_list(AnswserListData2);
        surveyAnswerList.add(surveyBeanA2);

        SurveyBean surveyBeaA3 = new SurveyBean();
        AnswserListData3.put("answer", "보통이다");
        AnswserListData3.put("answer_uid", "E3");
        AnswserListData3.put("order", "3");
        surveyBeaA3.setAnswer_list(AnswserListData3);
        surveyAnswerList.add(surveyBeaA3);

        SurveyBean surveyBeanA4 = new SurveyBean();
        AnswserListData4.put("answer", "그렇다");
        AnswserListData4.put("answer_uid", "E4");
        AnswserListData4.put("order", "4");
        surveyBeanA4.setAnswer_list(AnswserListData4);
        surveyAnswerList.add(surveyBeanA4);

        SurveyBean surveyBeanA5 = new SurveyBean();
        AnswserListData5.put("answer", "매우 그렇다");
        AnswserListData5.put("answer_uid", "E5");
        AnswserListData5.put("order", "5");
        surveyBeanA5.setAnswer_list(AnswserListData5);
        surveyAnswerList.add(surveyBeanA5);

        return surveyAnswerList;
    }

    public ArrayList<SurveyBean> getDataHashMapWithSurvdyBeanQuestionAnswer(){
        ArrayList<SurveyBean> surveyQuestionAnswerArrayList = new ArrayList<>();
        HashMap<String,String> QuestionAnswerList1 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList2 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList3 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList4 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList5 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList6 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList7 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList8 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList9 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList10 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList11 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList12 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList13 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList14 = new HashMap<>();
        HashMap<String,String> QuestionAnswerList15 = new HashMap<>();

        SurveyBean surveyBeanQA1 = new SurveyBean();
        QuestionAnswerList1.put("questions_uid", "Q1");
        QuestionAnswerList1.put("answer_uid", "E1");
        surveyBeanQA1.setQuestions_answers(QuestionAnswerList1);
        surveyQuestionAnswerArrayList.add(surveyBeanQA1);

        SurveyBean surveyBeanQA2 = new SurveyBean();
        QuestionAnswerList2.put("questions_uid", "Q1");
        QuestionAnswerList2.put("answer_uid", "E2");
        surveyBeanQA2.setQuestions_answers(QuestionAnswerList2);
        surveyQuestionAnswerArrayList.add(surveyBeanQA2);

        SurveyBean surveyBeanQA3 = new SurveyBean();
        QuestionAnswerList3.put("questions_uid", "Q2");
        QuestionAnswerList3.put("answer_uid", "E1");
        surveyBeanQA3.setQuestions_answers(QuestionAnswerList3);
        surveyQuestionAnswerArrayList.add(surveyBeanQA3);

        SurveyBean surveyBeanQA4 = new SurveyBean();
        QuestionAnswerList4.put("questions_uid", "Q2");
        QuestionAnswerList4.put("answer_uid", "E2");
        surveyBeanQA4.setQuestions_answers(QuestionAnswerList4);
        surveyQuestionAnswerArrayList.add(surveyBeanQA4);

        SurveyBean surveyBeanQA5 = new SurveyBean();
        QuestionAnswerList5.put("questions_uid", "Q2");
        QuestionAnswerList5.put("answer_uid", "E3");
        surveyBeanQA5.setQuestions_answers(QuestionAnswerList5);
        surveyQuestionAnswerArrayList.add(surveyBeanQA5);

        SurveyBean surveyBeanQA6 = new SurveyBean();
        QuestionAnswerList6.put("questions_uid", "Q3");
        QuestionAnswerList6.put("answer_uid", "E1");
        surveyBeanQA6.setQuestions_answers(QuestionAnswerList6);
        surveyQuestionAnswerArrayList.add(surveyBeanQA6);

        SurveyBean surveyBeanQA7 = new SurveyBean();
        QuestionAnswerList7.put("questions_uid", "Q3");
        QuestionAnswerList7.put("answer_uid", "E2");
        surveyBeanQA7.setQuestions_answers(QuestionAnswerList7);
        surveyQuestionAnswerArrayList.add(surveyBeanQA7);

        SurveyBean surveyBeanQA8 = new SurveyBean();
        QuestionAnswerList8.put("questions_uid", "Q4");
        QuestionAnswerList8.put("answer_uid", "E1");
        surveyBeanQA8.setQuestions_answers(QuestionAnswerList8);
        surveyQuestionAnswerArrayList.add(surveyBeanQA8);

        SurveyBean surveyBeanQA9 = new SurveyBean();
        QuestionAnswerList9.put("questions_uid", "Q4");
        QuestionAnswerList9.put("answer_uid", "E2");
        surveyBeanQA9.setQuestions_answers(QuestionAnswerList9);
        surveyQuestionAnswerArrayList.add(surveyBeanQA9);

        SurveyBean surveyBeanQA10 = new SurveyBean();
        QuestionAnswerList10.put("questions_uid", "Q4");
        QuestionAnswerList10.put("answer_uid", "E3");
        surveyBeanQA10.setQuestions_answers(QuestionAnswerList10);
        surveyQuestionAnswerArrayList.add(surveyBeanQA10);

        SurveyBean surveyBeanQA11 = new SurveyBean();
        QuestionAnswerList11.put("questions_uid", "Q4");
        QuestionAnswerList11.put("answer_uid", "E4");
        surveyBeanQA11.setQuestions_answers(QuestionAnswerList11);
        surveyQuestionAnswerArrayList.add(surveyBeanQA11);

        SurveyBean surveyBeanQA12 = new SurveyBean();
        QuestionAnswerList12.put("questions_uid", "Q4");
        QuestionAnswerList12.put("answer_uid", "E5");
        surveyBeanQA12.setQuestions_answers(QuestionAnswerList12);
        surveyQuestionAnswerArrayList.add(surveyBeanQA12);
        
        SurveyBean surveyBeanQA13 = new SurveyBean();
        QuestionAnswerList13.put("questions_uid", "Q5");
        QuestionAnswerList13.put("answer_uid", "E1");
        surveyBeanQA13.setQuestions_answers(QuestionAnswerList13);
        surveyQuestionAnswerArrayList.add(surveyBeanQA13);

        SurveyBean surveyBeanQA14 = new SurveyBean();
        QuestionAnswerList14.put("questions_uid", "Q5");
        QuestionAnswerList14.put("answer_uid", "E2");
        surveyBeanQA14.setQuestions_answers(QuestionAnswerList14);
        surveyQuestionAnswerArrayList.add(surveyBeanQA14);

        SurveyBean surveyBeanQA15 = new SurveyBean();
        QuestionAnswerList15.put("questions_uid", "Q5");
        QuestionAnswerList15.put("answer_uid", "E3");
        surveyBeanQA15.setQuestions_answers(QuestionAnswerList15);
        surveyQuestionAnswerArrayList.add(surveyBeanQA15);
        
        return surveyQuestionAnswerArrayList;
    }
}
