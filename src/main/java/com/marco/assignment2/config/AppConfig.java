package com.marco.assignment2.config;
/**
 * @author Marco Ross 215095014
 */
import com.marco.assignment2.service.Impl.MathPreExam;
import com.marco.assignment2.service.interfaces.AdvancedMath;
import com.marco.assignment2.service.interfaces.SimpleMath;
import com.marco.assignment2.service.Impl.MathExam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="sMath")
    public SimpleMath getSimpleMath(){
        return new MathPreExam();
    }

    @Bean(name="aMathExam")
    public AdvancedMath getAdvancedMath(){
        return new MathExam();
    }

    @Bean(name="aMathPreExam")
    public AdvancedMath getAdvancedMathPre(){
        return new MathPreExam();
    }
}
