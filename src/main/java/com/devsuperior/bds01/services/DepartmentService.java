package com.devsuperior.bds01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repository;
	
	
	public List<DepartmentDTO> findAll(){
		
		List<Department> list = repository.findAll(Sort.by("name"));
		
		return list.stream().map(depart -> new DepartmentDTO(depart)).toList();
		
	}

}
