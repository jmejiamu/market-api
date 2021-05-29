package com.jmejiamu.backend.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {

}
