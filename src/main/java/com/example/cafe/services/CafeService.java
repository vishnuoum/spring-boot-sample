package com.example.cafe.services;

import com.example.cafe.model.*;
import com.example.cafe.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Autowired
    SlotRepository slotRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    OrderRepository orderRepository;

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

    public Slot addSlot(Slot slot) {
        return slotRepository.save(slot);
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public String addTransaction(TransactionDAO transactionDAO) {
         Transaction transaction = new Transaction();
         transaction.setUser_id(transactionDAO.getUser_id());
         transaction = transactionRepository.save(transaction);
         List<Order> ordersList = new ArrayList<>();
        for (Order order: transactionDAO.getOrders()) {
            order.setTransaction_id(transaction.getId());
            ordersList.add(order);
        }
        orderRepository.saveAll(ordersList);
        return "Created";
    }

}
