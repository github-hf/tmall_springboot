package com.hf.tmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.tmall.dao.ReviewDAO;
import com.hf.tmall.pojo.Product;
import com.hf.tmall.pojo.Review;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewDAO reviewDAO;
    @Autowired
    ProductService productService;

    public void add(Review review){
        reviewDAO.save(review);
    }

    public List<Review> list(Product product){
        List<Review> result = reviewDAO.findByProductOrderByIdDesc(product);
        return result;
    }

    public int getCount(Product product){
        return reviewDAO.countByProduct(product);
    }

}
