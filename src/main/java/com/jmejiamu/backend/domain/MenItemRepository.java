package com.jmejiamu.backend.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin( origins =  "http://localhost:3000")
@Repository
public interface MenItemRepository extends CrudRepository<MenItems, Long> {
	
}
