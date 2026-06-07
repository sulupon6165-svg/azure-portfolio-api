package com.example.demo;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "items")
public class Item {

    @Id
    private String id;

    @PartitionKey
    private String id2;

    private String name;
    private String description;

    public Item() {}

    public Item(String id, String name, String description) {
        this.id = id;
        this.id2 = id;
        this.name = name;
        this.description = description;
    }

    public String getId() { return id; }
    public String getId2() { return id2; }
    public String getName() { return name; }
    public String getDescription() { return description; }

    public void setId(String id) { this.id = id; }
    public void setId2(String id2) { this.id2 = id2; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
}