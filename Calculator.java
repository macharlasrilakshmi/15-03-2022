package com.harman.project1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj=new Addition();
        Substraction subobj=new Substraction();
        Multiplication mulobj=new Multiplication();
        Division Divisionobj=new Division();
        Integer X,Y,addResult,subresult,multiplyresult,divisionresult;
        Scanner input=new Scanner(System.in);
        System.out.println("num1:");
        X=input.nextInt();
        System.out.println("num2");
        Y=input.nextInt();
        addResult=addobj.Addnumber(X,Y);
        System.out.println(addResult);
        subresult=subobj.Subtraction(X,Y);
        System.out.println(subresult);
        multiplyresult= mulobj.Multiplication(X,Y);
        System.out.println(multiplyresult);
        divisionresult= Divisionobj.Division(X,Y);
        System.out.println(divisionresult);




    }
}
