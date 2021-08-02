package com.example.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {
	@Autowired
	private AssignmentRepository repo;
	
	public List<Assignment> listAll(){
		return repo.findAll();
	}
	public Assignment get(int id) {
		return repo.findById(id).get();
	}
	public void save(Assignment assignment) {
		repo.save(assignment);
	}
	public void delete(int id) {
		repo.deleteById(id);
	}

}
