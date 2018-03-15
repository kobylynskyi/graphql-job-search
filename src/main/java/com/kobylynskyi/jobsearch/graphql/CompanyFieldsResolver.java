package com.kobylynskyi.jobsearch.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.kobylynskyi.jobsearch.data.JobRepository;
import com.kobylynskyi.jobsearch.entities.Company;
import com.kobylynskyi.jobsearch.entities.Job;

@Component
public class CompanyFieldsResolver implements GraphQLResolver<Company> {

  @Autowired
  private JobRepository jobRepository;

  public Iterable<Job> jobs(Company company) {
    return jobRepository.findAll(company.getJobIds());
  }

}
