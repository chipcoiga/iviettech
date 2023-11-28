package com.example.shopingcartjava51.remote.impl;

import com.example.shopingcartjava51.entity.ProductEntity;
import com.example.shopingcartjava51.remote.ProductRemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ProductRemoteServiceImpl implements ProductRemoteService {

    @Override
    public void create(ProductEntity product) {
        String url = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost")
                .port(8090)
                .path("rest/products")
                .toUriString();

        RestTemplate template = new RestTemplate();
        Object response = template.postForObject(url, product, Object.class);
        System.out.println(response);
    }
}
