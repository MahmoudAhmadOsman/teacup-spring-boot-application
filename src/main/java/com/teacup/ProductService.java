package com.teacup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
   private ProductRepository repository;

//Now, write all the HTTP methods

    //============ SAVE Method ============
    public  Product saveProduct(Product product){
        return repository.save(product);
    }

//============ POST Method ============
    //Save all Products and save at the same time and use saveAll methods that JPA provides
    public List<Product> saveProducts(List<Product> products){
        return  repository.saveAll(products);

    }


    //============ GET Method ============
    //Get or fetch all products from the database

public  List<Product> getProducts(){
        return  repository.findAll();

}

//Get a single product by its id
//    public Product getProductById(int id){
//        return  repository.findById(id).orElse(null);
//    }




    //============ UPDATE or Edit Method ============

public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        //Save all products into the database such as name, quantity and price
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);

}



    //============ DELETE Method ============

    public String deleteProduct(int id){
        repository.deleteById(id);
        return  "Product deleted successfully! "+id;
    }

}

























