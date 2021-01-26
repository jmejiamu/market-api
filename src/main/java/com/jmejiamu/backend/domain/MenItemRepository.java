package com.jmejiamu.backend.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenItemRepository extends CrudRepository<MenItems, Long> {
	
}
