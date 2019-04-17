package com.hf.tmall.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hf.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
