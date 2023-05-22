package com.spring.pagination.Service;

import com.spring.pagination.Entity.User;
import com.spring.pagination.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;


    public User getUserById(long userid) {
        return userRepo.getReferenceById(Long.valueOf(userid));
    }


    public Page<User> getAllUsersSortedByUserId(int pageNumber, int pageSize) {
        Pageable page = PageRequest.of(pageNumber, pageSize);
        return userRepo.findAll(page);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
