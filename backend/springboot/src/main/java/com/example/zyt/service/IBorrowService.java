package com.example.zyt.service;

import com.example.zyt.controller.request.BaseRequest;
import com.example.zyt.model.Borrow;
import com.example.zyt.model.Retur;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface IBorrowService {
    
    List<Borrow> list();

    PageInfo<Borrow> page(BaseRequest baseRequest);

    void save(Borrow obj);

    PageInfo<Retur> pageRetur(BaseRequest baseRequest);

    void saveRetur(Retur obj);

    Borrow getById(Integer id);

    void update(Borrow obj);

    void deleteById(Integer id);

    void deleteReturById(Integer id);

    Map<String, Object> getCountByTimeRange(String timeRange);
}
