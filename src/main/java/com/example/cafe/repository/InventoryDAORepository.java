package com.example.cafe.repository;

import com.example.cafe.model.InventoryDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryDAORepository extends JpaRepository<InventoryDAO, Integer> {
}
