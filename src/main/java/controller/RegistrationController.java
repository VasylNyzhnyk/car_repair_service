package controller;

import Repo.UserRepo;
import config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(User user){
        User userFromDB = userRepo.finfByUsername(user.getUserName());
        userRepo.save(user);
        return "redirect:/login";
    }


}
