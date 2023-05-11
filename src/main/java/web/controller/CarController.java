package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String CarsList(ModelMap model, @RequestParam(value = "count") Optional<Integer> count) {
        model.addAttribute("cars", carService.getCarslist(count.orElse(0)));
        return "cars";
    }
}
