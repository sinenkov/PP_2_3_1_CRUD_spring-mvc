package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc")
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam ("action") String action, Model model){
        double result;

        switch (action){
            case "multiplication":
                result =  a*b;
                break;
            case "division":
                result = a/(double)b;
                break;
            case "substraction":
                result = a-b;
                break;
            case "addition":
                result = a + b;
                break;
            default:
                result = 0;
        }
        model.addAttribute("result", result);
        return "calculator";
    }

}
