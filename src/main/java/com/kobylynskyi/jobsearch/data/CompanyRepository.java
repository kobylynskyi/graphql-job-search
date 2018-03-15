package com.kobylynskyi.jobsearch.data;

import org.springframework.data.repository.CrudRepository;

import com.kobylynskyi.jobsearch.entities.Company;

public interface CompanyRepository extends CrudRepository<Company, String> {
  Company findByName(String name);
}
