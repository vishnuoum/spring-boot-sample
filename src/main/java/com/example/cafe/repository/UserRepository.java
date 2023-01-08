package com.example.cafe.repository;

import com.example.cafe.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "Select * from user u where u.name= :name", nativeQuery = true)
    public List<User> getByName(@Param("name") String name);

    @Transactional
    @Modifying
    @Query(value = "Update user u set u.phone= :phone where u.id= :id", nativeQuery = true)
    public void updateUserPhone(@Param("id") int id, @Param("phone") String phone);

}
