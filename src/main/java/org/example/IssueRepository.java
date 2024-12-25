package org.example;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Integer> {

    @Query("SELECT NEW org.example.IssueDetailsDTO(i.issueId, i.reader.name, i.book.title, i.issueDate, i.returnDate) " +
            "FROM Issue i")
    List<IssueDetailsDTO> findAllIssuesWithDetails();
}