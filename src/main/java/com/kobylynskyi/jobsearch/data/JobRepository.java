package com.kobylynskyi.jobsearch.data;

import org.springframework.data.repository.CrudRepository;

import com.kobylynskyi.jobsearch.entities.Job;

public interface JobRepository extends CrudRepository<Job, String> {
}
