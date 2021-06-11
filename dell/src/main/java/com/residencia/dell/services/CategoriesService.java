package com.residencia.dell.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dell.entities.Categories;
import com.residencia.dell.repositories.CategoriesRepository;

@Service
public class CategoriesService {
	@Autowired CategoriesRepository categoriesRepository;
	
	public Categories findById(Integer id) {
		Categories category = categoriesRepository.findById(id).get();
		return category;
	}
	
	public List<Categories> findAll(){
		List<Categories> listCategories = categoriesRepository.findAll();
		return listCategories;
	}
	
	public Long count() {
		return categoriesRepository.count();
	}
	
	public Categories save(Categories category) {
		categoriesRepository.save(category);
		return categoriesRepository.getById(category.getCategory());
	}
	
	public Categories update(Categories category) {
		return categoriesRepository.save(category);
	}
	
	public boolean deleteById(Integer id) {
		if(id!=null)
		{
			categoriesRepository.deleteById(id);
			return true;
		}
		else
			return false;
	}
	
	
	
	
}
