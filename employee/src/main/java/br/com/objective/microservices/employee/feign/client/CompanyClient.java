package br.com.objective.microservices.employee.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "company")
public interface CompanyClient {

    @GetMapping("/company")
    List<String> listCompanies();
}

