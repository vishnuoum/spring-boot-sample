package com.example.cafe.repository;

import com.example.cafe.model.TransactionDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDAORepository extends JpaRepository<TransactionDAO, Integer> {
}
