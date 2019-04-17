package com.hf.tmall.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.hf.tmall.pojo.Product;
import com.hf.tmall.pojo.Property;
import com.hf.tmall.pojo.PropertyValue;
 
public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{
 
    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);
 
}