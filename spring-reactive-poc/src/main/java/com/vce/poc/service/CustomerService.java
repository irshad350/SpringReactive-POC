package com.vce.poc.service;

import com.vce.poc.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<Customer> save(Customer customer);
    Mono<Customer> findById(Long id);
    Flux<Customer> findAll();
    Mono<Void> deleteById(Long id);
}
