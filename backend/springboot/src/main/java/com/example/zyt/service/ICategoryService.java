package com.example.zyt.service;

import com.example.zyt.controller.request.BaseRequest;
import com.example.zyt.model.Category;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ICategoryService {
    
    List<Category> list();

    PageInfo<Category> page(BaseRequest baseRequest);

    void save(Category obj);

    Category getById(Integer id);

    void update(Category obj);

    void deleteById(Integer id);

}
