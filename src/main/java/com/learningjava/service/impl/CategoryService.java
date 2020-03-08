package com.learningjava.service.impl;

import com.learningjava.dao.ICategoryDAO;
import com.learningjava.model.CategoryModel;
import com.learningjava.service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
