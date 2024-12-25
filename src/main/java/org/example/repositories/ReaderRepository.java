package org.example.repositories;

import org.example.entities.Reader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepository extends CrudRepository<Reader, Integer> {

    @Query(value = "SELECT r FROM Reader r")
    List<Reader> findAllReaders();

    List<Reader> findReaderByName(String profile);
}
