package com.example.cafe.services;

import com.example.cafe.model.*;
import com.example.cafe.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    CategoryDAORepository categoryDAORepository;

    @Autowired
    ProductDAORepository productDAORepository;

    @Autowired
    InventoryDAORepository inventoryDAORepository;

    @Autowired
    TransactionDAORepository transactionDAORepository;

     public Optional<User> details(User user) {
        return userRepository.findById(user.getId());
    }

    public User saveUser(User user) {
         return userRepository.save(user);
    }

    public List<User> getUserByName(User user) {
         return userRepository.getByName(user.getName());
    }

    public List<CategoryDAO> getCategoryDetails() {
        return categoryDAORepository.findAll();
    }

    public List<ProductDAO> getProductDetails() {
        return productDAORepository.findAll();
    }

    public List<InventoryDAO> getInventoryDetails() {
        return inventoryDAORepository.findAll();
    }

    public List<TransactionDAO> getTransactionDetails() {
        return transactionDAORepository.findAll();
    }

}
