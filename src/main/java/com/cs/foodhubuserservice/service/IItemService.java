package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.entity.Items;

import java.util.List;

public interface IItemService {

    public List<Items> fetchAllItems();
    public Items fetchItemById(Integer itemId);
}
