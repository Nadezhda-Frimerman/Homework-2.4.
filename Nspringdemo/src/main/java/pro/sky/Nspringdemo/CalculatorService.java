package pro.sky.Nspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double getSummary (Double num1, Double num2){
        return num1+num2;
    }
    public double getSubtraction (Double num1, Double num2){
        return num1-num2;
    }
    public double getMultiplication (Double num1, Double num2){
        return num1*num2;
    }
    public double getDivision (Double num1, Double num2){
        return num1/num2;
    }
}
