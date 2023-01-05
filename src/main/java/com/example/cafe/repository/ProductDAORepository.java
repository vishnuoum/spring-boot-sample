package com.example.cafe.repository;

import com.example.cafe.model.ProductDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAORepository extends JpaRepository<ProductDAO,Integer> {
}
