package com.kobylynskyi.jobsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Job {

  private String id;
  private String title;
  private String location;
  private int salary;
}
