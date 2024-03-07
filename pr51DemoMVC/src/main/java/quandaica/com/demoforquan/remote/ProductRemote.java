package quandaica.com.demoforquan.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import quandaica.com.demoforquan.entity.ProductEntity;

import java.util.List;

@Component
public class ProductRemote {

    @Autowired
    private RestOperations template;

    public void insertProduct(ProductEntity entity) {
        String serviceUrl = "/api/products";
        String url = UriComponentsBuilder.newInstance()
                .host("localhost")
                .scheme("http")
                .port("9090")
                .path(serviceUrl)
                .build()
                .toUriString();

        template.postForEntity(url, entity, Void.class);

    }

    public List<ProductEntity> findAll() {
        String serviceUrl = "/api/products";
        String url = UriComponentsBuilder.newInstance()
                .host("localhost")
                .scheme("http")
                .port("9090")
                .path(serviceUrl)
                .build()
                .toUriString();

        return (List<ProductEntity>) template.getForEntity(url, List.class).getBody();
    }
}
