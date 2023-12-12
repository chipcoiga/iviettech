package com.example.abcuniversity.service.impl;

import com.example.abcuniversity.entity.TestDetail;
import com.example.abcuniversity.repository.TestDetailRepository;
import com.example.abcuniversity.service.TestDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDetailServiceImpl implements TestDetailService {

    @Autowired
    private TestDetailRepository detailRepository;

    @Override
    public List<TestDetail> search(String searchText, int testId) {

        return detailRepository.findByEmailOrFullName(searchText, testId);
    }
}
