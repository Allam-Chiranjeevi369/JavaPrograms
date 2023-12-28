package com.springMVC.registration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springMVC.registration.model.Register;

public interface RegistrationRepository extends JpaRepository<Register, Integer>{

}