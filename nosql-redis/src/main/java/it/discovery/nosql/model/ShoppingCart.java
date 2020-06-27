package it.discovery.nosql.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kiryl.drabysheuski
 */
@Getter
@Setter
@RedisHash(timeToLive = 30 * 60, value = "cart")
public class ShoppingCart  {

    @Id
    private int id;

    private LocalDateTime created;

    private List<String> books;
}
