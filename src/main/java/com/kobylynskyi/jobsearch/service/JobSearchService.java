package com.kobylynskyi.jobsearch.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kobylynskyi.jobsearch.data.CompanyRepository;
import com.kobylynskyi.jobsearch.data.JobRepository;
import com.kobylynskyi.jobsearch.entities.Company;
import com.kobylynskyi.jobsearch.entities.Job;

@Service
public class JobSearchService {

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

  public Company createCompany(String name) {
    return companyRepository.save(new Company(null, name, new ArrayList<>()));
  }

  public Job createJob(String companyId, String title, String location, int salary) {
    Job job = jobRepository.save(new Job(null, title, location, salary));

    Company company = companyRepository.findOne(companyId);
    company.getJobIds().add(job.getId());
    companyRepository.save(company);

    return job;
  }

}
