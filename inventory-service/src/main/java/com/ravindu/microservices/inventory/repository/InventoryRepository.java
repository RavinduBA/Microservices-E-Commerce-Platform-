package com.ravindu.microservices.inventory.repository;

import com.ravindu.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);

}
