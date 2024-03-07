package quandaica.com.demoforquan.service;

import quandaica.com.demoforquan.domain.UpSertProduct;
import quandaica.com.demoforquan.entity.ProductEntity;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();

    void create(UpSertProduct product) throws IOException;

    void insert(ProductEntity entity);
}
