package com.sj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sj.Model.TestCase;


  
public interface TestCaseRepository extends JpaRepository<TestCase, Integer>  
{  
}  
