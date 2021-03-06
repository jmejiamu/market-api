package com.jmejiamu.backend.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<RegisterUser, Long> {

	RegisterUser findByEmail(String email);
//	RegisterUser findById(int id);

}
