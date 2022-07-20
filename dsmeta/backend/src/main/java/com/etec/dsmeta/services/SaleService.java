package com.etec.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.etec.dsmeta.entities.Sale;
import com.etec.dsmeta.repositories.SaleRepository;
import java.util.List;
import org.springframework.stereotype.Service;

	@Service
	public class SaleService {

		@Autowired
		private SaleRepository repository;

		public List<Sale> findSales() {
			return repository.findAll();
		}
	}