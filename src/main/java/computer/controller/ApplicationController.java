package computer.controller;

import computer.dto.ComputerDTO;
import computer.dto.LaptopDTO;
import computer.service.CreateService;
import computer.service.EditService;
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
    private CreateService createService;
    private EditService editService;

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
   public String editResult(@PathVariable Long id, Model model) {
    model.addAttribute("laptop", laptopService.getLaptop(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editElement(@ModelAttribute("laptop") ComputerDTO laptop) {
        editService.editElement(laptop);
        return REDIRECT_RESULTS;
    }

    @GetMapping("/create")
    public String createComputer() {
        return "create";
    }

    @PostMapping("/create")
    public String createComputer(@ModelAttribute("laptop") LaptopDTO laptop) {
        createService.insertLaptop(laptop);
        return "create";
    }


}


