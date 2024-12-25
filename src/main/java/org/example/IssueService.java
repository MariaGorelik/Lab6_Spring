package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    public List<IssueDetailsDTO> getAllIssues() {
        List<IssueDetailsDTO> issues = issueRepository.findAllIssuesWithDetails();
        System.out.println(issues);
        return issues;
    }

}

