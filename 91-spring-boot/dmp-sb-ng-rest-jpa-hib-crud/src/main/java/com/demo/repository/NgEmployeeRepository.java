package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.NgEmployee;

@Repository
public interface NgEmployeeRepository extends JpaRepository<NgEmployee, Long>{

}
