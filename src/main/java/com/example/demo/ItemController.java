package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @GetMapping
    public List<Item> getAll() {
        return (List<Item>) repository.findAll();
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        item.setId(UUID.randomUUID().toString());
        item.setId2(item.getId());
        return repository.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}