package com.marco.assignment2.service.Impl;
/**
 * @author Marco Ross 215095014
 */
import com.marco.assignment2.service.interfaces.AdvancedMath;

public class MathExam implements AdvancedMath {

    @Override
    public int addAndDivide(int num1, int num2, int num3) {
        return (num1 + num2)/num3;
    }

    @Override
    public double multiplyAndDivide(double num1, double num2, double num3) {
        return num1*(num2/num3);
    }
}