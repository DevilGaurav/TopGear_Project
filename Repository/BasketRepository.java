package com.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Basket;

@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {
}
