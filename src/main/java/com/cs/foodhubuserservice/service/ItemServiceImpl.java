package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.client.ItemClient;
import com.cs.foodhubuserservice.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private ItemClient itemClient;

    @Override
    public List<Items> fetchAllItems() {
        return itemClient.getAllItems();
    }

    @Override
    public Items fetchItemById(Integer itemId) {
        return itemClient.getItemById(itemId);
    }
}
