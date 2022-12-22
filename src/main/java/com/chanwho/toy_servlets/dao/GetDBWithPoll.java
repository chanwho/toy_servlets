package com.chanwho.toy_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class GetDBWithPoll {
        public HashMap<String, Object> getQuestion(String ORDERS) throws SQLException{
                Commons commons = new Commons();
                Statement statement = commons.getStatement();
                HashMap<String, Object> questionHash = new HashMap<>();
                String query = "";
                
                query = "select * from questions_list where ORDERS = '"+ORDERS+"';";
                
                ResultSet resultSet = statement.executeQuery(query);

                while(resultSet.next()){
                        questionHash.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
                        questionHash.put("QUESTIONS", resultSet.getString("QUESTIONS"));
                        questionHash.put("ORDERS", resultSet.getString("ORDERS"));
                }

                return questionHash;
        }
        public ArrayList<HashMap> getAnswer() throws SQLException{
                Commons commons = new Commons();
                Statement statement = commons.getStatement();
                ArrayList<HashMap> exampleArray = new ArrayList<>();
                HashMap<String, Object> exampleDataHash = null;


                for (int i = 1; i<6; i++){
                        exampleDataHash = new HashMap<>();
                        String query = "select * from example_list where ORDERS = '"+ Integer.toString(i)+"';";
                        ResultSet resultSet = statement.executeQuery(query);
                        // for문 작성
                        while(resultSet.next()){
                                exampleDataHash.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));
                                exampleDataHash.put("EXAMPLE", resultSet.getString("EXAMPLE"));
                                exampleDataHash.put("ORDERS", resultSet.getString("ORDERS"));
                        }
                        exampleArray.add(exampleDataHash);
                }

                return exampleArray;
        }
        public HashMap<String, Object> getQuestioniAnswer(String QUESTIONS_UID) throws SQLException{
                Commons commons = new Commons();
                Statement statement = commons.getStatement();
                HashMap<String, Object> QAListHash = new HashMap<>();
                String query = "select * from answers where QUESTIONS_UID = '"+QUESTIONS_UID+"';";
                
                ResultSet resultSet = statement.executeQuery(query);

                while(resultSet.next()){
                        QAListHash.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));
                        QAListHash.put("EXAMPLE_UID", resultSet.getString("EXAMPLE_UID"));
                }

                return QAListHash;
        }

}
