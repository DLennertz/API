package com.residencia.dell.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.residencia.dell.Exception.CustomException;
import com.residencia.dell.entities.Categories;
import com.residencia.dell.services.CategoriesService;



@RestController
@RequestMapping("/category")
public class CategoriesController {

	@Autowired CategoriesService categoriesService;
	
	@GetMapping("/{id}")
	public Categories findById(@PathVariable Integer id) {
		return categoriesService.findById(id);
	}
	
	@PutMapping
	public Categories update(@Valid @RequestBody Categories category) {
	/*	if(category.getCategory()==null) {
			throw new CustomException("id de cateroria nulo","400");
		}*/
		return categoriesService.update(category);
	}
}
