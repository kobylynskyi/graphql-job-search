package com.kobylynskyi.jobsearch.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kobylynskyi.jobsearch.entities.Company;
import com.kobylynskyi.jobsearch.entities.Job;
import com.kobylynskyi.jobsearch.service.JobSearchService;

@Service
public class JobSearchResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private JobSearchService jobSearchService;

  public Iterable<Company> companies() {
    return jobSearchService.companies();
  }

  public Company getCompany(String name) {
    return jobSearchService.getCompany(name);
  }

  public Company createCompany(String name) {
    return jobSearchService.createCompany(name);
  }

  public Job createJob(String companyId, String title, String location, int salary) {
    return jobSearchService.createJob(companyId, title, location, salary);
  }

}
