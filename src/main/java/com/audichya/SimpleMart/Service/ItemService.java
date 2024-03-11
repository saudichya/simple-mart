package com.audichya.SimpleMart.Service;

import com.audichya.SimpleMart.Database.ItemsRepository;
import com.audichya.SimpleMart.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemsRepository itemsRepository;

    public List<Item> getAllItems() {
        return itemsRepository.findAll();
    }

    public Item save(Item item) {
        return itemsRepository.save(item);
    }
}
