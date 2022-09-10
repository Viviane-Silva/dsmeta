package com.springreactteste.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactteste.dsmeta.entities.Sale;
import com.springreactteste.dsmeta.repositories.SalesRepository;


@Service
public class SaleService {
	
	@Autowired
	private SalesRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
		
	}
}
