package computer.controller;


import computer.service.CreateService;
import computer.service.LaptopService;
import dto.Laptop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class ApplicationController {

    private LaptopService laptopService;
    private CreateService createService;

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

    @GetMapping("/edit/{id}")
   public String editResult(@PathVariable Long id, @ModelAttribute("laptop") Laptop model) {

        return "update";
    }


    @GetMapping("/create")
    public String createComputer() {
        return "create";
    }

    @PostMapping("/create")
    public String createComputer(@ModelAttribute("laptop") Laptop model) {
        createService.insertLaptop(model);
        return "create";
    }

}


