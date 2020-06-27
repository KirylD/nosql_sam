package it.discovery.nosql.repository;

import org.springframework.data.keyvalue.repository.KeyValueRepository;

import it.discovery.nosql.model.ShoppingCart;

/**
 * @author kiryl.drabysheuski
 */
public interface ShoppingCartRepository
    extends KeyValueRepository<ShoppingCart, Integer> {
}
