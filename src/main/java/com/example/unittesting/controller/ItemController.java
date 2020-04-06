package com.example.unittesting.controller;

import com.example.unittesting.model.Item;
import com.example.unittesting.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-service")
    public Item itemFromService() {
        return itemService.retrieveItem();
    }

    @GetMapping("/all-items")
    public List<Item> allItems() {
        return itemService.retrieveAllItems();
    }

}
