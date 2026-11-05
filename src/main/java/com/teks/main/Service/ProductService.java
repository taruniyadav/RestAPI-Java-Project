package com.teks.main.Service;

import com.teks.main.Entity.Product;

import java.util.List;

public interface ProductService {

//    method to add or save the product
     Product addProduct(Product product);

//    method to get all the products
     List<Product> getAllproducts();
//
//    method to get product by id
     Product getproductbyId(int id);

//    method to update
     Product UpdateProduct(int id, Product product);

//delete method

    void DeleteProduct(int id);
}
