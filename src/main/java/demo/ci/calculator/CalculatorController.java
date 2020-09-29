package demo.ci.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @PostMapping("/add")
    public String add(@RequestBody AddDto param) {
        return Integer.toString(Calculator.add(param.getA(), param.getB()));
    }
}
