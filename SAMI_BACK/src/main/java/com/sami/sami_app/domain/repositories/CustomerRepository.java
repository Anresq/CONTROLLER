package com.sami.sami_app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sami.sami_app.domain.entities.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}