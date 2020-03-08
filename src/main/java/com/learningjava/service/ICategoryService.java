package com.learningjava.service;

import com.learningjava.model.CategoryModel;

import java.util.List;

public interface ICategoryService {
	List<CategoryModel> findAll();
}
