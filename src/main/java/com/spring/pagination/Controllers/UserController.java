package com.spring.pagination.Controllers;

import com.spring.pagination.Entity.Book;
import com.spring.pagination.Entity.User;
import com.spring.pagination.Service.BookService;
import com.spring.pagination.Service.UserService;
import com.spring.pagination.dto.BookUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService usersService;

    @Autowired
    BookService bookService;


    @GetMapping("/user")
    public List<User> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{userid}")
    public ResponseEntity<String> getUserRole(@PathVariable long userid) {
        User user = usersService.getUserById(Long.parseLong(String.valueOf(userid)));

        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        String role = user.getRole();
        return ResponseEntity.ok("User role: " + role);
    }

    @GetMapping("/users/sorted-order")
//    http://localhost:8080/users/sorted-order?pageNumber=0&pageSize=3
    public List<User> getAllUsersSortedByUserId(
            @RequestParam(defaultValue = "0")int pageNumber,
            @RequestParam(defaultValue = "10")int pageSize){
        return usersService.getAllUsersSortedByUserId(pageNumber,pageSize).getContent();
    }

    @GetMapping("/bookuserdto")
      public List<BookUserDto> getAllDetails(){
        List<BookUserDto> bookUserDto=new ArrayList<>();
        List<User> users=usersService.getAllUsers();
        List<Book> books=bookService.getAllBooks();
        for (User user:users){
            BookUserDto dto=new BookUserDto();
            dto.setUserid(user.getUserid());
            dto.setName(user.getName());
            dto.setMail(user.getMail());
            for (Book book:books){
                    dto.setTitle(book.getTitle());
            }
            bookUserDto.add(dto);
        }
        return bookUserDto;
      }

}

