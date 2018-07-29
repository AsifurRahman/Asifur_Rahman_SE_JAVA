package com.ict.ecomApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class aboutController {

    @RequestMapping(method = RequestMethod.GET, value = "/about")
    public String loginView(Model model) {
       return "about";
    }

}
