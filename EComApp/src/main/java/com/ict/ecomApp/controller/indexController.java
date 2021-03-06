package com.ict.ecomApp.controller;
import com.ict.ecomApp.EcomAppApplication;
import com.ict.ecomApp.dao.ProductRepository;
import com.ict.ecomApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class indexController {   //This is DashBoard Controller

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("---This  is Home page---");

        model.addAttribute("sell",EcomAppApplication.totsellcount);

        List<Product> maxprofitList=productRepository.findTop5ByOrderByPpDesc();   //find the only maximum five profitable List in Descending Order

        model.addAttribute("maxprofitList",maxprofitList);// Bind data into the FrontEnd

        System.out.println(maxprofitList);    //Printing Back-End

        return "index";
    }
}