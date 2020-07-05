package com.teacup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
@Autowired
    private ProductService service;


    @RequestMapping("/")
    public  String HomePage(Model model){

//        List<Product> listProducts = service.listAll();
//        model.addAttribute("listProducts", listProducts);


        return  "index";
    }


}

