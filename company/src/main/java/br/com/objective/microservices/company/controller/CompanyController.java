package br.com.objective.microservices.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping
    public List<String> listCompanies() {
        return Arrays.asList("Google","Oracle","Objective");
    }

}
