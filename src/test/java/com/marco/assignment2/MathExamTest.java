package com.marco.assignment2;

import com.marco.assignment2.config.AppConfig;
import com.marco.assignment2.service.interfaces.AdvancedMath;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MathExamTest {
    private AdvancedMath advancedMath;

    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        advancedMath = (AdvancedMath) ctx.getBean("aMathExam");
    }

    @After
    public void tearDown() {
        System.out.println("Test Complete");
    }

    @Test
    public void addAndDivide() {
        int result = advancedMath.addAndDivide(10,20,5);
        Assert.assertEquals(6, result);
    }

    @Test
    public void multiplyAndDivide() {
        double result = advancedMath.multiplyAndDivide(5,5,3);
        Assert.assertEquals(8.3,result, 0.1);
    }
}