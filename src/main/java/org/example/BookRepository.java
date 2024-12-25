package org.example;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    @Query(value = "SELECT b FROM Book b")
    List<Book> findAllBooks();

    @Query(value = "SELECT b FROM Book b WHERE b.title = :title")
    List<Book> findBooksByTitle();
}
