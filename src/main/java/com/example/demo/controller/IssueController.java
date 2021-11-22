package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.IssueRepository;

@Controller
public class IssueController {
    @Autowired
    private IssueRepository repository;



    @GetMapping("/issues")
    public String getAllIssues(Model model) {
        model.addAttribute("issues", repository.findAll());
        return "list-issues";
    }
}