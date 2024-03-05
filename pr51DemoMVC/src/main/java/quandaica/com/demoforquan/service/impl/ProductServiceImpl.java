package quandaica.com.demoforquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import quandaica.com.demoforquan.domain.UpSertProduct;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.repository.ProductRepository;
import quandaica.com.demoforquan.service.ProductService;

import java.io.*;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<ProductEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public void create(UpSertProduct product) throws IOException {
        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        entity.setImagePath(generateImagePath(product.getFile()));
        repository.save(entity);
    }

    private String generateImagePath(MultipartFile file) throws IOException {
        String fileExtension = getFileExtension(file.getOriginalFilename());

        File file1 = new File("/Users/lehuuloc/Documents/iViettech/Java53/demoForQuan/" + file.getOriginalFilename());

        try (OutputStream os = new FileOutputStream(file1)) {
            os.write(file.getBytes());
        }

        return file1.getAbsolutePath();
    }


    private String getFileExtension(String originalFilename) {
        return "";
    }
}
