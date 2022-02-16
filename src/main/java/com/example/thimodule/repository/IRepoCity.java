package com.example.thimodule.repository;

import com.example.testmodule4.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRepoCity extends PagingAndSortingRepository<City, Long> {
}
