package com.spring.pagination.Repository;

import com.spring.pagination.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();

    User getReferenceById(Long aLong);
}
