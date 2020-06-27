package it.discovery.nosql.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import it.discovery.nosql.model.ShoppingCart;

import static org.junit.Assert.assertEquals;

/**
 * @author kiryl.drabysheuski
 */
public class ShoppingCartRepositoryTest extends BaseRedisTest {

    @Autowired
    ShoppingCartRepository repository;

    @Test
    public void saveShoppingCart() {
        final ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(10);
        shoppingCart.setCreated(LocalDateTime.now());
        shoppingCart.setBooks(List.of("1", "2"));

        repository.save(shoppingCart);

        final ShoppingCart loadedEntity = repository.findById(10).orElseThrow();
        assertEquals(2, loadedEntity.getBooks().size());
    }

}
