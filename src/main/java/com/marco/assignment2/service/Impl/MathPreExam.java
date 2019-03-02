package com.marco.assignment2.service.Impl;
/**
 * @author Marco Ross 215095014
 */
import com.marco.assignment2.service.interfaces.AdvancedMath;
import com.marco.assignment2.service.interfaces.SimpleMath;

public class MathPreExam implements SimpleMath, AdvancedMath {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int addAndDivide(int num1, int num2, int num3) {
        if(num3 != 0)
           return (num1+num2)/num3;
        return 0;
    }

    @Override
    public double multiplyAndDivide(double num1, double num2, double num3) {
        return (num1*num2)/num3;
    }
}
