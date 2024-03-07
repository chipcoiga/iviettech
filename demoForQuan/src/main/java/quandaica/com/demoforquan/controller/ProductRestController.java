package quandaica.com.demoforquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import quandaica.com.demoforquan.domain.UpSertProduct;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.service.ProductService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductEntity>  showProduct() {
        return productService.getAll();
    }

    @GetMapping("{id}")
    public ProductEntity showProductDetail(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody ProductEntity entity) throws IOException {
        productService.insert(entity);
    }
}
