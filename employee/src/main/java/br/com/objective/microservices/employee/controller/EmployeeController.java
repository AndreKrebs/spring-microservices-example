package br.com.objective.microservices.employee.controller;

import br.com.objective.microservices.employee.feign.client.CompanyClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final CompanyClient companyClient;

    public EmployeeController(CompanyClient companyClient) {
        this.companyClient = companyClient;
    }

    @GetMapping
    public List<String> listEmployees() {
        System.out.println(companyClient.listCompanies().toString());

        return Arrays.asList("Maria","Carlos","Pedro");
    }

}
