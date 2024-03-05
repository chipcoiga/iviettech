package quandaica.com.demoforquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private String showProduct(Model model) {

        List<ProductEntity> productEntityList = productService.getAll();

        model.addAttribute("products", productEntityList);

        return "Product";
    }
}
