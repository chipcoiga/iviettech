package quandaica.com.demoforquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quandaica.com.demoforquan.domain.UpSertProduct;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.service.ProductService;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String showProduct(Model model) {

        List<ProductEntity> productEntityList = productService.getAll();

        model.addAttribute("products", productEntityList);

        return "Product";
    }

    @GetMapping("creates")
    public String showCreatePage(Model model) {
        model.addAttribute("name", "");
        model.addAttribute("price", "");
        model.addAttribute("file", "");
        return "CreateProduct";
    }

    @PostMapping("creates")
    public String createProduct(@ModelAttribute UpSertProduct product) throws IOException {


        productService.create(product);

        return "redirect:/products";
    }
}
