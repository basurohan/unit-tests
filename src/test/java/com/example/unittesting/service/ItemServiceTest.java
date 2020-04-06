package com.example.unittesting.service;

import com.example.unittesting.model.Item;
import com.example.unittesting.repository.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {

//    @InjectMocks
    ItemService classUnderTest;

    @Mock
    ItemRepository itemRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        classUnderTest = new ItemService(itemRepository);
    }

    @Test
    public void retrieveAllItems() {
        when(itemRepository.findAll()).thenReturn(Collections.singletonList(new Item(1000, "Item1", 10, 30)));

        List<Item> items = classUnderTest.retrieveAllItems();

        assertEquals(1, items.size());
        assertEquals(Integer.valueOf(300), items.get(0).getValue());
    }
}