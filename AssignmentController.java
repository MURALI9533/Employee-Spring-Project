package com.example.assignment;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AssignmentController {
	@Autowired
	private AssignmentService service;
	@GetMapping("/assignments")
	public List<Assignment> list(){
		return service.listAll();
	}
	@DeleteMapping("/assignments/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	@PostMapping("/assignments")
	public void add(@RequestBody Assignment assignment) {
		service.save(assignment);
	}
	@PutMapping("assignments/{id}")
	public ResponseEntity<?> update(@PathVariable int id,@RequestBody Assignment assignment){
		try {
			Assignment assignexist=service.get(id);
			assignexist.setFirstname(assignment.getFirstname());
			assignexist.setLastname(assignment.getLastname());
			assignexist.setMiddlename(assignment.getMiddlename());
			assignexist.setPhoneno(assignment.getPhoneno());
			service.save(assignexist);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
}
