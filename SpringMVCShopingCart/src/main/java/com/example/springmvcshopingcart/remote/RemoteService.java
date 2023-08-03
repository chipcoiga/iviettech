package com.example.springmvcshopingcart.remote;

import com.example.springmvcshopingcart.entity.ProductEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class RemoteService {

    public List<ProductEntity> getProductFromOtherClient() {
        //Url
        String url =  UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost")
                .port(8080)
                .path("products/rest")
                .build()
                .toUriString();
        //Call API

        RestOperations restOperations = new RestTemplate();
        return (List<ProductEntity>)restOperations.getForObject(url, List.class);
    }
}
