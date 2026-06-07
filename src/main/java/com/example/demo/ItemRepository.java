package com.example.demo;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CosmosRepository<Item, String> {
}