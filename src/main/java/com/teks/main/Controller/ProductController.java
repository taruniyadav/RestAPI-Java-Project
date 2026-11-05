package com.teks.main.Controller;

import com.teks.main.Entity.Product;
import com.teks.main.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){

        return service.addProduct(product);
    }

    @GetMapping("/allproducts")
    public List<Product> getAllProducts(){
        return service.getAllproducts();
    }

    @GetMapping("/getbyid{id}")
    public Product getProductbyid(@PathVariable int id){
        return service.getproductbyId(id);
    }

    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product newProduct){
        return service.UpdateProduct(id, newProduct);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String Deleteproduct(@PathVariable int id){
         service.DeleteProduct(id);
         return "deleted product successfully";
    }

}
