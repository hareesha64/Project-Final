
package com.sj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.Model.TestCase;
import com.sj.Repository.TestCaseRepository;



@Service
public class TestCaseService {
	
	@Autowired
	TestCaseRepository dao;

	public List<TestCase> getAllTestCases() {
		
		return dao.findAll();
	}
	
	public TestCase TestCaseById(int id) {
		Optional<TestCase> test = dao.findById(id);
		return test.get();
		
	}
	
	public TestCase addTestCase(TestCase food) {
		return dao.save(food);
		
	}
	
	public void deleteTestCase(int id) {
		dao.deleteById(id);
		
	}
	public TestCase updateTestCase(TestCase t) {
		Optional<TestCase> update =dao.findById(t.getId());
		TestCase fi = update.get();
		fi.setRuntime(t.getRuntime());
		return dao.save(fi);
	}

}
