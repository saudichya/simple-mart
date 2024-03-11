package com.audichya.SimpleMart.Controller;

import com.audichya.SimpleMart.Model.Item;
import com.audichya.SimpleMart.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String getApi() {
        return "Hello world";
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @PostMapping(path = "/addItem")
    public Item addItem(@RequestBody Item item) {
        System.out.println(item);
        return itemService.save(item);
    }
}
