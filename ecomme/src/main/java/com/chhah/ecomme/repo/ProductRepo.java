package com.chhah.ecomme.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chhah.ecomme.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>  {

}
