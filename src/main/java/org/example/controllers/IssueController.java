package org.example.controllers;

import org.example.entities.IssueDetailsDTO;
import org.example.services.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @GetMapping
    public String listIssue(Model model) {
        Iterable<IssueDetailsDTO> issues = issueService.getAllIssues();
        System.out.println(issues);
        model.addAttribute("issues", issues);
        return "issues";
    }
}
