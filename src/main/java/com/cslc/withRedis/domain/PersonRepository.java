package com.cslc.withRedis.domain;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jay on 2018/5/7.
 */
@Cacheable
public interface PersonRepository extends JpaRepository<Person,Integer>{

    @Cacheable
    @Query("from Person u where u.name=:name")
    Person findByName(@Param("name") String name);

}
