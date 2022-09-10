package com.springreactteste.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreactteste.dsmeta.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
