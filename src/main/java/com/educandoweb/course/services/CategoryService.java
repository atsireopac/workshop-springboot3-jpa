package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.respositories.CategoryRepository;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private OrderRepository repository;
	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
