package com.teks.main.Service;

import com.teks.main.Entity.Product;
import com.teks.main.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repo;

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAllproducts() {
        return repo.findAll();
    }



    @Override
    public Product getproductbyId(int id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("product Not found"));
    }

    @Override
    public Product UpdateProduct(int id, Product newproduct) {

        Product existingProduct = getproductbyId(id);

        existingProduct.setName(newproduct.getName());
        existingProduct.setPrice(newproduct.getPrice());

        return repo.save(existingProduct);
    }

    @Override
    public void DeleteProduct(int id) {
        repo.deleteById(id);
    }


}
