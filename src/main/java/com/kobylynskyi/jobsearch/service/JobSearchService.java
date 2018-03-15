package com.kobylynskyi.jobsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.jobsearch.data.CompanyRepository;
import com.kobylynskyi.jobsearch.data.JobRepository;
import com.kobylynskyi.jobsearch.entities.Company;

@Service
public class JobSearchService implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private JobRepository jobRepository;

  public Iterable<Company> companies() {
    return companyRepository.findAll();
  }

  public Company getCompany(String name) {
    return companyRepository.findByName(name);
  }

}
