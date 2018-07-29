package com.ict.ecomApp.controller;
import com.ict.ecomApp.dao.UserRepository;
import com.ict.ecomApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class registerController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerView() {
        System.out.println("---This  is Register page---");
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerView(Model model, @ModelAttribute()User user) {
        System.out.println("---This  is Register page Post/Backend---");
        user.setRole("ROLE_USER");
        userRepository.save(user);
        System.out.println("Successfully got the  object");
        return "redirect:./login";
    }
}


