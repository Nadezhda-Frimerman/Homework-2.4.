package pro.sky.Nspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping ()
        public String getHello (){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String getPlus (@RequestParam (value = "num1") Double num1,
                          @RequestParam (value = "num2") Double num2){
        if (num1==null||num2==null){
            return "отсутствует параметр";
        }
        double result = calculatorService.getSummary (num1, num2);
        return num1+" + "+num2+" = "+result;
    }

    @GetMapping(path = "/minus")
    public String getMinus (@RequestParam (value = "num1") Double num1,
                            @RequestParam (value = "num2") Double num2){
        if (num1==null||num2==null){
            return "отсутствует параметр";
        }
        double result = calculatorService.getSubtraction (num1, num2);
        return num1+" - "+num2+" = "+result;
    }
    @GetMapping(path = "/multiply")
    public String getMultiply (@RequestParam (value = "num1") Double num1,
                               @RequestParam (value = "num2") Double num2){
        if (num1==null||num2==null){
            return "отсутствует параметр";
        }
        double result = calculatorService.getMultiplication (num1, num2);
        return num1+" * "+num2+" = "+result;
    }
    @GetMapping(path = "/divide")
    public String getDivide (@RequestParam (value = "num1") Double num1,
                               @RequestParam (value = "num2") Double num2){
        if (num1==null||num2==null){
            return "отсутствует параметр";
        }
        if (num2==0){
            return "Делить на ноль нельзя";
        }
        double result = calculatorService.getDivision (num1, num2);
        return num1+" / "+num2+" = "+result;
    }

}
