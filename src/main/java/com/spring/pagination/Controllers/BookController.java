package com.spring.pagination.Controllers;


import com.spring.pagination.Entity.Book;
import com.spring.pagination.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class BookController {


    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

   @GetMapping("/books/{userid}")
    public List<Book> getAllBoosById(@PathVariable long userid) {
       return bookService.getBooks(userid);
   }

   @GetMapping("/books/sorted-by-userid")
   //localhost:8080/books/sorted-by-userid?pageNumber=0&pageSize=3
    public List<Book> getAllBooksSortedByUserId(
            @RequestParam(defaultValue = "0")int pageNumber,
            @RequestParam(defaultValue = "10")int pageSize){
        return bookService.getAllBooksSortedByUserId(pageNumber,pageSize).getContent();
   }
}
