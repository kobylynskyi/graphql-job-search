package com.kobylynskyi.jobsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Collection;

@Getter
@AllArgsConstructor
public class Company {

  private String id;
  private String name;
  private Collection<String> jobIds;
}
