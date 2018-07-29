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
public class buyController {   //This is Buy Controller

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/buyProduct", method = RequestMethod.GET)
    public String Buymethod(Model model) {

        EcomAppApplication.totsellcount++;    // I  had increment in each time a client buy an item. This is only Demo,

        model.addAttribute("sell",EcomAppApplication.totsellcount);// I don't have any sell/buy method effectively. Only just retrieved the data.

        List<Product> maxprofitList=productRepository.findTop5ByOrderByPpDesc();   //find the only maximum five profitable List in Descending Order

        model.addAttribute("maxprofitList",maxprofitList);// Bind data into the FrontEnd

        return "index";
    }
}