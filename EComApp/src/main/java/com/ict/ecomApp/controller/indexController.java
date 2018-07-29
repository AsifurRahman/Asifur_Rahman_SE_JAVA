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

        EcomAppApplication.totsellcount++;    //This is Silly logic. I  had increment in each time i access to dashboard. This is only Demo,
                                             // I don't have any sell/buy method. Only just retrieved the data.
        model.addAttribute("sell",EcomAppApplication.totsellcount);

        List<Product> maxprofitList=productRepository.findTop5ByOrderByPpDesc();   //find the only maximum five profitable List in Descending Order

        model.addAttribute("maxprofitList",maxprofitList);// Bind data into the FrontEnd

        System.out.println(maxprofitList);    //Printing Back-End

        return "index";
    }
}