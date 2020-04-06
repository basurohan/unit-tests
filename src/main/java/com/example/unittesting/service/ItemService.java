package com.example.unittesting.service;

import com.example.unittesting.model.Item;
import com.example.unittesting.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item retrieveItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems() {
        List<Item> items = itemRepository.findAll();
        return items.stream()
                .peek(item -> item.setValue(item.getPrice() * item.getQuantity()))
                .collect(Collectors.toList());
    }

}
