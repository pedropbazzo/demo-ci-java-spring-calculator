package demo.ci.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @PostMapping("/add")
    public AddResultDto add(@RequestBody AddDto param) {
        return new AddResultDto(param, Calculator.add(param.getA(), param.getB()));
    }
}
