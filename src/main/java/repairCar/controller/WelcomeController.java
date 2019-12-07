package repairCar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Welcome to our SERVICE") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

}
