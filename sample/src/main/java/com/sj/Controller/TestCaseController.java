
package com.sj.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.Model.TestCase;
import com.sj.service.TestCaseService;





@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class TestCaseController {
	
	@Autowired
	TestCaseService service;
	
	@GetMapping("/test")
	public List<TestCase> getTestCase(){
		return service.getAllTestCases();
		
	}
	
	@GetMapping("/test/{id}")
	public TestCase getTestCaseById(@PathVariable int id) {
		return service.TestCaseById(id);
	}

	@PostMapping("/test")
	public TestCase addTestCase(@RequestBody TestCase test) {
		return service.addTestCase(test);
		
	}
	
	@GetMapping("/test/Delete/{id}")
	public List<TestCase> deleteTestCase(@PathVariable int id) {
		service.deleteTestCase(id);
		return service.getAllTestCases();
	}
	
	@PutMapping("/test")
	public TestCase  updateTestCase(@RequestBody TestCase t) {
		return service.updateTestCase(t);
		
	}
}