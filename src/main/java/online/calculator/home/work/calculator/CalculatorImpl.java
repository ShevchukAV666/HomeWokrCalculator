package online.calculator.home.work.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введённые данные не корректны!");

        } else return num1 + " + " + num2 +" = " + (Integer.parseInt(num1)+Integer.parseInt(num2));
    }

    public String minus(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введённые данные не корректны!");

        } else return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    public String multi(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введённые данные не корректны!");

        }else return num1 + " * " + num2 +" = " + (Integer.parseInt(num1)*Integer.parseInt(num2));
    }

    public String delenie(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введённые данные не корректны");
        } else if (Integer.parseInt(num2) == 0) {
            throw new NullPointerException("Деление на ноль запрещено!");
        } else return num1 + " / " + num2 +" = " + (Integer.parseInt(num1)/Integer.parseInt(num2));
    }
}

