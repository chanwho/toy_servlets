package com.chanwho.toy_servlets.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class SurveyBean {
    HashMap<String,String> questions_list;
    HashMap<String,String> answer_list ;
    HashMap<String,String> questions_answers ;

    // value를 get
    public HashMap<String, String> getQuestions_list() {
        return questions_list;
    }
    public HashMap<String, String> getAnswer_list() {
        return answer_list;
    }
    public HashMap<String, String> getQuestions_answers() {
        return questions_answers;
    }

    // value를 set
    public void setQuestions_list(HashMap<String, String> questions_list) {
        this.questions_list = questions_list;
    }
    public void setAnswer_list(HashMap<String, String> answer_list) {
        this.answer_list = answer_list;
    }
    public void setQuestions_answers(HashMap<String, String> questions_answers) {
        this.questions_answers = questions_answers;
    }
}
