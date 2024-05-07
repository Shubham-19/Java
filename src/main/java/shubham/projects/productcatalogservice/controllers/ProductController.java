package shubham.projects.productcatalogservice.controllers;

import org.springframework.web.bind.annotation.*;
import shubham.projects.productcatalogservice.dtos.ProductDto;
import shubham.projects.productcatalogservice.models.Product;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts(){
        return null;
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable("id") Long productId){
        Product product = new Product();
        product.setId(productId);
        product.setName("Product Name");
        product.setDescription("Product Description");
        product.setPrice(10000000D);

        return product;
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productDto;
    }

    @PutMapping("/update/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto productDto){
        return productDto;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long productId){
        return "Product with the productId: " + productId + " Deleted";
    }
}
