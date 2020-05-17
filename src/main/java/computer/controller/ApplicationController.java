package computer.controller;


import computer.service.LaptopService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class ApplicationController {

private LaptopService laptopService;

    private static final String REDIRECT_RESULTS = "redirect:/welcome";

    @GetMapping({"/", "/welcome"})
    public String home(Model model) {
        model.addAttribute("results", laptopService.getAllLaptops());
        return "welcome";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResult(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
        return REDIRECT_RESULTS;
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
