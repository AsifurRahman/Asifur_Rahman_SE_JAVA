package com.ict.ecomApp.controller;
import com.ict.ecomApp.dao.ProductRepository;
import com.ict.ecomApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/upsertProduct", method = RequestMethod.GET)
    public String productEdit(Model model, @RequestParam(value ="productId", required=false) Integer productId) {

        System.out.println("----------Product  Creation Method---------");

        if(productId== null){         //Product Insertion
            Product product = new Product();
            model.addAttribute("product", product);
        }
        else {    //Product Update
            Product product = productRepository.getProductById(productId);
            model.addAttribute("product", product);
        }
        return "product";
    }

    @RequestMapping(value = "/upsertProduct", method = RequestMethod.POST)
    public String productUpdatePost(Model model, @ModelAttribute("product") Product product, HttpServletRequest request) {
        System.out.println("-----------product Save Post/Backend-------------");
        System.out.println(product);
        try{
            productRepository.save(product);     //Saving the product
            request.setAttribute("message", "Edited successfully");
        }
        catch(Exception e){
            request.setAttribute("message", "Faild to save Edit");
        }
        return "redirect:./productList";
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(Model model, @RequestParam(value="productId", required=false) Integer productId) {
        System.out.println("-----------delete-------------productId:"+productId);
        Product product = productRepository.getProductById(productId);
        productRepository.delete(product);
        return "redirect:./productList";
    }

    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public String productListView(Model model) {
        System.out.println("-----------productListView-------------");
        List<Product> productList=productRepository.findAll();   //Finding all list from database
        model.addAttribute("productList",productList);
        return "productList";
    }

}