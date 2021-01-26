package com.jmejiamu.backend.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WomenItemRepository extends CrudRepository<WomenItem, Long>{

}
