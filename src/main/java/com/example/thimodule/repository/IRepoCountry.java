package com.example.thimodule.repository;

import com.example.testmodule4.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRepoCountry extends PagingAndSortingRepository<Country, Long> {
}
