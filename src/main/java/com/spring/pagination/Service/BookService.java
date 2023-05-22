package com.spring.pagination.Service;

import com.spring.pagination.Entity.Book;
import com.spring.pagination.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository booksRepo;


    public List<Book> getAllBooks() {
        return booksRepo.findAll();
    }

    public  List<Book> getBooks(long userid){
        return booksRepo.findBooksByUserUserid(userid);
    }

    public Page<Book> getAllBooksSortedByUserId(int pageNumber, int pageSize) {
        Pageable page = PageRequest.of(pageNumber, pageSize);
        return booksRepo.findAll(page);
    }

}
