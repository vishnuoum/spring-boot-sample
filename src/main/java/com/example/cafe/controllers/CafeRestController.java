package com.example.cafe.controllers;

import com.example.cafe.model.*;
import com.example.cafe.services.CafeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class CafeRestController {

    @Autowired
    CafeService cafeService;

    @GetMapping("/")
    public String home() {
        return "Hello";
    }


    @PostMapping("/data")
    public String data(@RequestBody User user){
        System.out.println(user.getName());
        return "OK";
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody User user){
        System.out.println(user.getName());
        User userTemp = cafeService.saveUser(user);
        System.out.println(userTemp.getId());
        return "OK";
    }

    @PostMapping("/details")
    public Optional<User> details(@RequestBody User user) {
        return cafeService.details(user);
    }

    @PostMapping("/getByName")
    public List<User> getByName(@RequestBody User user) {
        return cafeService.getUserByName(user);
    }

    @GetMapping("/getCategory")
    public List<CategoryDAO> getCategory() {
        return cafeService.getCategoryDetails();
    }

    @GetMapping("/getProduct")
    public List<ProductDAO> getProduct() {
        return cafeService.getProductDetails();
    }

    @GetMapping("/getInventory")
    public List<InventoryDAO> getInventory() {
        return cafeService.getInventoryDetails();
    }

    @GetMapping("/getTransaction")
    public List<TransactionDAO> getTransaction() {
        return cafeService.getTransactionDetails();
    }

    @PostMapping("/addSlot")
    public ResponseEntity<String> addSlot(@Valid @RequestBody Slot slot) {
        cafeService.addSlot(slot);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/addCategory")
    public ResponseEntity<String> addCategory(@Valid @RequestBody Category category) {
        cafeService.addCategory(category);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@Valid @RequestBody Product product) {
        cafeService.addProduct(product);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/addInventory")
    public ResponseEntity<String> addInventory(@Valid @RequestBody Inventory inventory) {
        cafeService.addInventory(inventory);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/addTransaction")
    public ResponseEntity<String> addTransaction(@Valid @RequestBody TransactionDAO transactionDAO) {
        cafeService.addTransaction(transactionDAO);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }


}
