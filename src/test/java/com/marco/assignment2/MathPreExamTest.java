package com.marco.assignment2;

import com.marco.assignment2.config.AppConfig;
import com.marco.assignment2.service.interfaces.AdvancedMath;
import com.marco.assignment2.service.interfaces.SimpleMath;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MathPreExamTest {
    private SimpleMath simpleMath;
    private AdvancedMath advancedMath;

    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        simpleMath = (SimpleMath) ctx.getBean("sMath");
        advancedMath = (AdvancedMath) ctx.getBean("aMathPreExam");
    }

    @After
    public void tearDown() {
        System.out.println("Test Complete");
    }

    @Test
    public void add() {
        int result = simpleMath.add(20,15);
        Assert.assertEquals(35, result);
    }

    @Test
    public void addAndDivideWithZero() {
        int result = advancedMath.addAndDivide(10,10,0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void addAndDivide() {
        int result = advancedMath.addAndDivide(10,10,2);
        Assert.assertEquals(10, result);
    }

    @Test
    public void multiplyAndDivide() {
        double result = advancedMath.multiplyAndDivide(5,3,3);
        Assert.assertEquals(5,result, 0.1);
    }
}