package com.hf.tmall.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.hf.tmall.pojo.Order;
import com.hf.tmall.pojo.OrderItem;
import com.hf.tmall.pojo.Product;
import com.hf.tmall.pojo.User;
 
public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    //根据产品获取OrderItem的方法
    List<OrderItem> findByProduct(Product product);
    //根据用户获取OrderItem的方法
    List<OrderItem> findByUserAndOrderIsNull(User user);
}