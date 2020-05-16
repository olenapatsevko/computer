package computer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class ApplicationController {

    private static final String REDIRECT_RESULTS = "redirect:/results";

    @GetMapping({"/", "/welcome"})
    public String home() {
        return "welcome";
    }


}


//    @GetMapping("/abs")
//    public String absForm(Model model) {
//        return "abs";
//    }
//
//    @GetMapping("/add")
//    public String addForm(Model model) {
//        return "add";
//    }
//
//    @GetMapping("/mul")
//    public String mulForm(Model model) {
//        return "mul";
//    }
//    @GetMapping("/edit/{id}")
//    public String editResult(@PathVariable Long id, Model model) {
//        CalculationResult calculationResult = applicationFacade.populateResultById(id);
//        model.addAttribute("calculationResult", calculationResult);
//        return "update";
//    }
