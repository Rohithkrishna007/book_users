package com.spring.pagination.Repository;

import com.spring.pagination.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


    List<Book> findBooksByUserUserid(long userid);

    List<Book> findAll();
}
