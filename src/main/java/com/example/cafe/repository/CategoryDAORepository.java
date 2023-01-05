package com.example.cafe.repository;

import com.example.cafe.model.CategoryDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAORepository extends JpaRepository<CategoryDAO,Integer> {
}
