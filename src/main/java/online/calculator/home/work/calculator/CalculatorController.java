package online.calculator.home.work.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorImpl calculatorService;

    public CalculatorController(CalculatorImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multi(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.multi(num1, num2);
    }
}

