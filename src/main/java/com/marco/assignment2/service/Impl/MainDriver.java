package com.marco.assignment2.service.Impl;
/**
 * @author Marco Ross 215095014
 */
import java.util.*;

public class MainDriver {
    public static void main(String[] args){
        //Collections Concepts
        MainDriver mainDriver = new MainDriver();
        System.out.println("_____Collections Examples_____");
        mainDriver.PersonList();
        mainDriver.PersonSet();
        mainDriver.PersonMap();
        mainDriver.PersonCollection();
        System.out.println();
        System.out.println("**************************************************************************************");

        //Math Exam
        MathExam mathExam = new MathExam();
        System.out.println("_____Math Exam Examples_____");
        System.out.println("\033[0;1mMathExam: \033[0;0m");
        System.out.println("Add And Divide Answer: " + mathExam.addAndDivide(10,20,5));

        //MathPreExam
        MathPreExam mathPreExam = new MathPreExam();
        System.out.println();
        System.out.println("\033[0;1mMathPreExam: \033[0;0m");
        int result = mathPreExam.addAndDivide(10,20,0);
        if(result == 0){
            System.out.println("Add And Divide Answer: Cannot Divide by zero");
        }else{
            System.out.println("Add And Divide Answer: " + result);
        }
    }

    //List example
    public void PersonList(){
        List<String> nameList = new LinkedList<>();

        System.out.println("\033[0;1mNames displayed using LinkedList: \033[0;0m");
        nameList.add("John");
        nameList.add("Kenny");
        nameList.add("David");

        for(int i = 0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }

    //Set example
    public void PersonSet(){
        Set<Integer> nameList = new HashSet<>();

        System.out.println();
        System.out.println("\033[0;1mNumbers displayed using HashSet: \033[0;0m");
        nameList.add(5);
        nameList.add(10);
        nameList.add(18);
        nameList.add(18); //Will be ignored by Set

        System.out.println(nameList);
    }

    //HashMap example
    public void PersonMap(){
        HashMap<String,String> personMap = new HashMap<>();

        System.out.println();
        System.out.println("\033[0;1mNames displayed using Hashmap: \033[0;0m");
        personMap.put("Person1", "Andrew");
        personMap.put("Person2", "Bob");
        personMap.put("Person3", "Steven");
        personMap.put("Person4", "Ann");

        System.out.println(personMap.get("Person1") + "\n" + personMap.get("Person4")); //Displaying only two people
    }

    //General Collection API example
    public void PersonCollection(){
        Collection<String> personCollection = new HashSet<>();

        System.out.println();
        System.out.println("\033[0;1mPeople displayed using Collection API: \033[0;0m");
        personCollection.add("Andrew");
        personCollection.add("Steven");
        personCollection.add("Bob");

        System.out.println(personCollection);
    }


}
