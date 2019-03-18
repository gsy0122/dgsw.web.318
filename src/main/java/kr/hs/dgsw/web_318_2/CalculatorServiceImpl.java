package kr.hs.dgsw.web_318_2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int calculator(String num1, String num2, String sign) {
        int result = 0;
        switch (sign) {
            case "+":
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                break;
            case "-":
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                break;
            case "×":
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                break;
            case "÷":
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                break;
        }
        return result;
    }
}
