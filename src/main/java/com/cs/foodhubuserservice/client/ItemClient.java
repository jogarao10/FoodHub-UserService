package com.cs.foodhubuserservice.client;

import com.cs.foodhubuserservice.entity.Items;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "foodHubApplication", url = "http://localhost:7071")
public interface ItemClient {

    @GetMapping("/items/all")
    List<Items> getAllItems();

    @GetMapping("/items/{itemId}")
    Items getItemById(@PathVariable("itemId") Integer itemId);
}
