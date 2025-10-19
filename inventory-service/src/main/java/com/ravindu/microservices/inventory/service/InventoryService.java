package com.ravindu.microservices.inventory.service;

import org.springframework.stereotype.Service;
import com.ravindu.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;


@Service 
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
    }
}
